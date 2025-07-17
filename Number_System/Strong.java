package Number_System;

public class Strong {
    public static void main(String[] args) {
        int num = 145;
        int sum=0;
        int temp = num;
        while(temp != 0){
            int rem = temp % 10;
            int fact = 1;
            for(int i=1;i<=rem;i++){
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if(sum == num){
            System.out.println("Yes it is");
        }
        else{
            System.out.println("No");
        }
    }
}
