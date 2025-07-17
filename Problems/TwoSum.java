package Problems;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 1, 3, 4 };
        int target = 12;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    System.out.println("Yeah");
                    return;
                }

            }
        }
        System.out.println("No Pairs Result Target: " + target);
    }
}
