package Patterns;

public class F {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                if(j==0 || i==0 || i==2){
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

* * * * *
*
* * * * *
*
*

 */