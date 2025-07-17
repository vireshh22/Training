package Number_System;

public class Niven {
    public static void main(String[] args) {
        int num = 17;
        int temp = num;
        int sum = 0;
        while(temp != 0){
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        if(num % sum == 0){
            System.out.println("Yes it is");
        }
        else{
            System.out.println("No");
        }
    }
}
