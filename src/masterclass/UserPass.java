package masterclass;

import java.util.Scanner;

public class UserPass {

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public UserPass(String userName) {
        this.userName = userName;
    }

    public String userName;

    public UserPass(int password) {
        this.password = password;
    }

    public int password;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your username ");

    }
}
