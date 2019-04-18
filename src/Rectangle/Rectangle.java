package Rectangle;

public class Rectangle {

    //Triangle
    int a = 8;
    int b = 9;
    int c = 7;
    double S;
    double A;

        private static  void getArea() {

            int a = 8;
            int b = 9;
            int c = 7;
            double S;

            S = (a * b)  / 2;
            System.out.println("The Area of Rectangle is : " + S);

        }


    public static void main(String[] args) {

            getArea();
            getPerimeter();
    }

    private static void getPerimeter() {
        int a = 8;
        int b = 9;
        int c = 7;double P;

        P = (a + b + c);
        System.out.println("The Perimeter of Rectangle is : " + P);
    }

}
