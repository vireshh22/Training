package Strings;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = sc.next();

        if (password.length() < 8 || password.length() > 15) {
            System.out.println("Password should be between 8-15 characters.");
            return;
        }

        int numbers = 0;
        int special = 0;
        int capital = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                numbers++;
            }
            if (password.charAt(i) >= 58 && password.charAt(i) <= 64) {
                special++;
            }
            if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                capital++;
            }
        }

        if (capital > 0) {
            if (special > 0) {
                if (numbers > 0) {
                    System.out.println("Strong Password");
                } else {
                    System.out.println("Password should contains numbers as well.");
                }
            } else {
                System.out.println("Password should contains special characters as well.");
            }
        } else {
            System.out.println("Password should contain at least one capital letter");
        }

        sc.close();
    }
}
