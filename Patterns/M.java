package Patterns;

public class M {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(j==0 || j== 4 || i==j && j<=2 || (j-i==2 && i!=0)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*

*       *
**     **
* *   * *
*  * *  *
*   *   *

 */