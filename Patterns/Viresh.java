package Patterns;

public class Viresh {
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==j && i<=2){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*
*    *
 *  *
   *
 */