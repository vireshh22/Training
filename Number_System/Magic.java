package Number_System;

public class Magic {
    public static void main(String[] args) {
        int num = 1234;
        int temp = num;
        int sum = 0;
        while(temp != 0){
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        if(sum == 1){
            System.out.println("Yes it is");
        }else{
            System.out.println("No");
        }
    }
}
