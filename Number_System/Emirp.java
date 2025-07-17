package Number_System;

public class Emirp {
    public static void main(String[] args) {
        int num = 13;
        if (isPrime(num)) {
            int rev = 0;
            int temp = num;
            while (temp != 0) {
                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp /= 10;
            }
            if (isPrime(rev)) {
                System.out.println("Emirp Number");
            }else{
                System.out.println("Not a emirp number");
            }
        } else {
            System.out.println("The original number is not prime number");
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
