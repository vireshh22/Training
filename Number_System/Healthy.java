package Number_System;

public class Healthy {
    public static void main(String[] args) {
        int num = 8;
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum > num) System.out.println("Healthy");
        else System.out.println("Deficient Number");
    }
}
