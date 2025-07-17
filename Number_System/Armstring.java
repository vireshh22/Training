package Number_System;

public class Armstring {
    public static void main(String[] args) {
        int num = 1634;
        int size = String.valueOf(num).length();
        int temp = num;
        int sum=0;
        while(temp != 0){
            int rem = temp % 10;
            sum += Math.pow(rem, size);
            temp /= 10;
        }
        if(sum == num){
            System.out.println("Yes it is");
        }else{
            System.out.println("No");
        }
    }
}
