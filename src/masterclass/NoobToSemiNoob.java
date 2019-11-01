package masterclass;

public class NoobToSemiNoob {

    public static void main(String[] args) {

        //convert 50 km to miles -> km * 0,62137

        double kilometers = 50;
        double miles = kilometers * 0.62137;
        System.out.println(miles);
        System.out.println("------------------------");

        //convert 300 yards to miles -> 1 yard = .00056818

        double yards = 300;
        double mi = yards * 0.00056818;
        System.out.println(mi);
        System.out.println("------------------");

        //find perimeter/ area of a rectangle  length 4 and width 2

        int length = 4;
        int width = 2;
        System.out.println("Perimeter of a rectangle is =  " + 2 * (length + width));
        System.out.println("Area of a rectangle is = " + (length * width));
        System.out.println("----------------------------------");

        //find perimeter/ area of square which has side of 2

        int side = 2;
        System.out.println("Perimeter of a square is = " + (4 * side));
        System.out.println("Area of a square is = " + (side * side));
        System.out.println("----------------------------");

        // convert 30 celcius to farenheit F = C * 9/5 + 32
        double celcius = 30;
        double farenheit = celcius * 9 / 5 + 32;
        System.out.println("Celcius to farenheit is =  " + farenheit);


        // convert 70 farenheit to celcius  C = (F - 32) * 5/9
        double far = 70;
        System.out.println("Farengheit to Celcius = " + (far - 32) * 5 / 9 );


    }
}
