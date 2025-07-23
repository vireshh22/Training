import java.util.Scanner;

public class P_25A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int[] numbers = new int[no];
        int even_count = 0, even_index = -1;
        int odd_count = 0, odd_index = -1;
        for (int i = 0; i < no; i++) {
            numbers[i] = sc.nextInt();

            if (numbers[i] % 2 == 0) {
                even_count += 1;
                even_index = i + 1;
            } else {
                odd_count += 1;
                odd_index = i + 1;
            }
        }
        if (even_count == 1) {
            System.out.println(even_index);
        } else {
            System.out.println(odd_index);
        }
        sc.close();
    }
}
