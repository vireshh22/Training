package Number_System;

public class Kaprekar {
    public static void main(String[] args) {
        int n = 9;
        if (n == 1)
            System.out.println(true);
        int sq_n = n * n;
        int count_digits = 0;
        while (sq_n != 0) {
            count_digits++;
            sq_n /= 10;
        }

        sq_n = n * n;

        for (int r_digits = 1; r_digits < count_digits; r_digits++) {
            int eq_parts = (int) Math.pow(10, r_digits);
            if (eq_parts == n)
                continue;
            int sum = sq_n / eq_parts + sq_n % eq_parts;
            if (sum == n)
                System.out.println(true);
            return;
        }

        System.out.println(false);

    }
}