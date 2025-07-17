package Strings;

import java.util.Scanner;

public class Pan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your PAN number:");
        String pan = sc.next();

        if (pan.length() != 10) {
            System.out.println("PAN number should be 10 characters.");
            return;
        }

        for (int i = 0; i < pan.length(); i++) {
            char ch = pan.charAt(i);

            if (i >= 0 && i <= 4 || i == 9) {
                if (ch < 65 || ch > 90) {
                    System.out.println("Only capital letters should be at positions 1-5 and 10.");
                    return;
                }
            } else if (i >= 5 && i <= 8) {
                if (ch < 48 || ch > 57) {
                    System.out.println("Only numbers should be at positions 6-9.");
                    return;
                }
            }
        }

        System.out.println("Valid PAN format.");

        sc.close();
    }
}

