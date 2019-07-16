package exercises02;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Poker extends JFrame {
    private Card deck[];
    private Card hand[];
    private int currentCard;
    private JButton dealButton, shuffleButton;
    private JTextField displayCard;
    private JLabel status;
    private int numbers[];
    private String faces[], suits[], output;

    public Poker()
    {
        super( "Card Dealing Program" );

        String f[] = { "Ace", "Deuce", "Three", "Four",
                "Five", "Six", "Seven", "Eight",
                "Nine", "Ten", "Jack", "Queen",
                "King" };
        String s[] = { "Hearts", "Diamonds",
                "Clubs", "Spades" };

        faces = f;
        suits = s;
        numbers = new int[ 13 ];

        deck = new Card[ 52 ];
        hand = new Card[ 5 ];

        currentCard = -1;

        for ( int i = 0; i < deck.length; i++ )
            deck[ i ] = new Card( faces[ i % 13 ],
                    suits[ i / 13 ] );

        Container c = getContentPane();
        c.setLayout( new FlowLayout() );

        dealButton = new JButton( "Deal hand" );
        dealButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed( ActionEvent e )
                    {
                        displayCard.setText( "" );    // clear text area
                        output = "";

                        for ( int n = 0; n < hand.length; n++ ) {
                            Card dealt = dealCard();

                            if ( dealt != null ) {
                                hand[ n ] = dealt;
                                displayCard.setText( displayCard.getText() +
                                        hand[ n ].toString() + "\n" );
                            }
                            else {
                                displayCard.setText(
                                        "NO MORE CARDS TO DEAL" );
                                status.setText(
                                        "Shuffle cards to continue" );
                            }
                        }

                        totalHand();    // calculates contents of the hand
                        pair();
                        threeOfAKind();
                        fourOfAKind();
                        straight();
                        flush();
                    }
                }
        );
        c.add( dealButton );

        shuffleButton = new JButton( "Shuffle cards" );
        shuffleButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed( ActionEvent e )
                    {
                        displayCard.setText( "SHUFFLING ..." );
                        shuffle();
                        displayCard.setText( "DECK IS SHUFFLED" );
                    }
                }
        );
        c.add( shuffleButton );

        displayCard = new JTextField( 20 );
        displayCard.setEditable( false );
        c.add( displayCard );

        status = new JLabel();
        c.add( status );

        setSize( 275, 250 );  // set the window size
        show();               // show the window
    }

    public void shuffle()
    {
        currentCard = -1;

        for ( int i = 0; i < deck.length; i++ ) {
            int j =  ( int ) ( Math.random() * 52 );
            Card temp = deck[ i ];   // swap
            deck[ i ] = deck[ j ];   // the
            deck[ j ] = temp;        // cards
        }

        dealButton.setEnabled( true );
    }

    public Card dealCard()
    {
        if ( ++currentCard < deck.length )
            return deck[ currentCard ];
        else {
            dealButton.setEnabled( false );
            return null;
        }
    }

    private void totalHand()
    {
        for ( int x = 0; x < faces.length; x++ )
            numbers[ x ] = 0;

        for ( int h = 0; h < hand.length; h++ )
            for ( int f = 0; f < faces.length; f++ )
                if ( hand[ h ].getFace().equals( faces[ f ] ) )
                    ++numbers[ f ];
    }

    public void pair()
    {
        for ( int k = 0; k < faces.length; k++ )
            if ( numbers[ k ] == 2 )
                output += ( "Pair of " + faces[ k ] + "'s  " );

        status.setText( output );
    }

    public void threeOfAKind()
    {
        for ( int k = 0; k < faces.length; k++ )
            if ( numbers[ k ] == 3 ) {
                output += ( "Three " + faces[ k ] + "'s" );
                break;
            }

        status.setText( output );
    }

    public void fourOfAKind()
    {
        for ( int k = 0; k < faces.length; k++ )
            if ( numbers[ k ] == 4 )
                output += ( "Four " + faces[ k ] + "'s" );

        status.setText( output );
    }

    public void flush()
    {
        String theSuit = hand[ 0 ].getSuit();

        for ( int s = 1; s < hand.length; s++ )
            if ( hand[ s ].getSuit().compareTo( theSuit ) != 0 )
                return;   // not a flush

        output += ( "flush in " + theSuit );
        status.setText( output );
    }

    public void straight()
    {
        int locations[] = new int[ 5 ], z = 0;

        for ( int y = 0; y < numbers.length; y++ )
            if ( numbers[ y ] == 1 )
                locations[ z++ ] = y;

        bubbleSort( locations );

        int faceValue = locations[ 0 ];

        for ( int m = 1; m < locations.length; m++ ) {

            if ( faceValue != locations[ m ] - 1 )
                return;   // not a straight
            else
                faceValue = locations[ m ];
        }

        output += "straight ";
        status.setText( output );
    }

    private void bubbleSort( int values[] )
    {
        for ( int pass = 1; pass < values.length; pass++ )
            for ( int comp = 0; comp < values.length - 1; comp++ )
                if ( values[ comp ] > values[ comp + 1 ] ) {
                    int temp = values[ comp ];
                    values[ comp ] = values[ comp + 1 ];
                    values[ comp + 1 ] = values[ comp ];
                }
    }

    public static void main( String args[] )
    {
        Poker app = new Poker();

        app.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing( WindowEvent e )
                    {
                        System.exit( 0 );
                    }
                }
        );
    }
}

class Card {
    private String face;
    private String suit;

    public Card( String f, String s )
    {
        face = f;
        suit = s;
    }

    protected String getSuit() { return suit; }
    protected String getFace() { return face; }
    public String toString() { return face + " of " + suit; }
}
