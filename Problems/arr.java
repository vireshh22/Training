package Problems;
public class arr {
    public static void main(String[] args) {
        int[] arr = { 5,4,1};
        int n = arr.length;
        int sum = 0;
        int exp = (n + 2) * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int res = exp - sum;
        System.out.println();
        System.out.println("Missing Number: " + res);
    }
}
