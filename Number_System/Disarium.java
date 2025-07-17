package Number_System;

class Disarium {
    public static void main(String[] args) {
        int num = 89;
        int size = String.valueOf(num).length();
        int temp = num;
        int sum = 0;
        for (int i = size; i >= 1; i++) {
            int res = getNumber(temp);
            temp /= 10;
            sum += Math.pow(res, i);
        }
        if (sum == num) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static int getNumber(int num) {
        int rem = 0;
        while (num != 0) {
            rem = num % 10;
            num /= 10;
        }
        return rem;
    }
}