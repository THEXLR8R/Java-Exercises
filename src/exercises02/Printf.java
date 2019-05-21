package exercises02;

import java.math.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Printf {

    public static void main(String[] args) {

        long n = 461012;

        System.out.printf("%d%n",n);
        System.out.printf("%014d%n",n);
        System.out.printf("%+8d%n",n);
        System.out.printf("%,8d%n",n);
        System.out.printf("%+,8d%n%n", n);

        double pi = Math.PI;

        System.out.printf("%f%n",pi);
        System.out.printf("%.3f%n",pi);
        System.out.printf("%10.3f%n",pi);
        System.out.printf("-10.3f%n",pi);

        Locale bg = new Locale("bg", "BG");
        Locale.setDefault(bg);

        System.out.println(Locale.getDefault());
        System.out.printf(bg,"%-10.4f%n%n",pi);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, -50);

        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yy");
        System.out.println("Current date is : " + formatter.format(calendar.getTime()));

        System.out.printf("%tB %te, %tY%n", calendar,calendar,calendar);

  //      System.out.printf("%t1:%tM %tp%n", calendar, calendar, calendar);    // <----WIP

        System.out.printf("%tD%n",calendar);

        System.out.printf("%.16s\n", "Tihomir Petrov Bogdanov");



    }


}
