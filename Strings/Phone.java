package Strings;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        long first = number / 1000000000l;
        if (first == 6 || first == 7 || first == 8 || first == 9) {
            long temp = number;
            int len = 0;
            while (temp != 0) {
                long rem = temp % 10;
                len += 1;
                temp /= 10;
            }
            if (len == 10) {
                System.out.println("Valid Number");
            } else {
                System.out.println("Not a valid number");
            }
        } else {
            System.out.println("Not a valid number.");
        }
    }
}
