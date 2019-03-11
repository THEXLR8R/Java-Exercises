package Strings;

public class ReverseStringWithRecution {

    private static String  reverseString(String str) {

        if (str.length() < 2) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);


    }

    public static void main(String[] args) {

        System.out.println(reverseString("Hello what's your name?"));
    }

}
