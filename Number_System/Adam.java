package Number_System;

public class Adam {
    public static void main(String[] args) {
        int num = 13;
        int sq_num = square(num);
        int temp = num;
        int rev = reverse(temp);
        int sq_rev = square(rev);
        if (sq_num == reverse(sq_rev)) {
            System.out.println("It is Adam Number");
        } else {
            System.out.println("No it not Adam Number");
        }
    }

    public static int square(int num) {
        return num * num;
    }

    public static int reverse(int temp) {
        int rev = 0;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        return rev;
    }
}
