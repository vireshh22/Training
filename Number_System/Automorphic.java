package Number_System;

public class Automorphic {
    public static void main(String[] args) {
        int num = 25;
        int square = num * num;

        int temp = num;
        int pow = 1;

        while (temp != 0) {
            pow *= 10;
            temp /= 10;
        }

        if (square % pow == num) {
            System.out.println(num + " is Automorphic.");
        } else {
            System.out.println(num + " is NOT Automorphic.");
        }
    }
}
