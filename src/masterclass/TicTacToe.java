package masterclass;

import java.util.Scanner;

public class TicTacToe {

    public static boolean hasWinner(char [][] board, char player) {
        if (board[0][0] == player && board[1][0] == player && board[2][0] == player)
            return true;
        else if (board[0][1] == player && board[1][1] == player && board[2][1] == player)
            return true;
        else if (board[0][2] == player && board[1][2] == player && board[2][2] == player)
            return true;
        else if (board[0][0] == player && board[0][1] == player && board[0][2] == player)
            return true;
        else if (board[1][0] == player && board[1][1] == player && board[1][2] == player)
            return true;
        else if (board[2][0] == player && board[2][1] == player && board[2][2] == player)
            return true;
        else if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;
        else if (board[2][0] == player && board[1][1] == player && board[0][2] == player)
            return true;
        else
            return false;
    }

    public static void printBoard (char [][] board) {
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void intializeArray (char [][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j< board.length; j++) {
                board[i][j] = '0';
            }
        }

    }

    public static boolean validMove (char [][] board, int [] playerMove, char player) {
        if (playerMove[0] >= 0 && playerMove[0] <= 2 &&
                playerMove[1] >= 0 && playerMove[1] <= 2){
            if (board[playerMove[0]] [playerMove[1]] == '0') {
                board[playerMove[0]] [playerMove[1]] = player;
                return true;
            }
        }
        return false;
    }

    public static char changePlayer (char player) {
        if (player == 'x')
            return 'o';
        return 'x';
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char [][] board = new char [3][3];
        char player = 'x';
        int moveLeft = 9;
        int [] playerMove = new int [2];
        boolean isValid = false;
        intializeArray(board);

        while (true) {
            while (isValid == false) {
                System.out.println("Player " + player + "turn. Enter the coordinates :");
                playerMove[0] = input.nextInt();
                playerMove[1] = input.nextInt();
                isValid = validMove(board,playerMove,player);
                if(isValid==false)
                    System.out.println("Invalid input. Please try again!");
            }
            moveLeft--;
            printBoard(board);

            if(hasWinner(board,player)) {
                input.close();
                break;
            }
            isValid = false;
            player = changePlayer(player);

            if (moveLeft == 0) {
                moveLeft = 9;
                intializeArray(board);
                player = 'x';
                System.out.println("Restart the game ! No winner. ");
            }

        }
        System.out.println("Winner is player " + player);
    }

}
