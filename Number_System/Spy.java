package Number_System;

public class Spy {
    public static void main(String[] args) {
        int num = 1124;
        int addition=0,mul=1;
        int temp=num;
        while(temp != 0){
            int rem = temp % 10;
            addition += rem;
            mul *= rem;
            temp /= 10;
        }
        if(addition == mul){
            System.out.println("Yes it is");
        }
        else{
            System.out.println("No");
        }
    }
}
