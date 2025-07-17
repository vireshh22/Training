package Basics;
class Prime {
    public static void main(String[] args) {
        for (int i = 21; i <= 40; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}