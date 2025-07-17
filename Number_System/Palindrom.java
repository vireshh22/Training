package Number_System;

public class Palindrom {

   public static void main(String[] var0) {
      short var1 = 1221;
      int var2 = var1;

      int var3;
      for(var3 = 0; var2 != 0; var2 /= 10) {
         int var4 = var2 % 10;
         var3 = var3 * 10 + var4;
      }

      if (var3 == var1) {
         System.out.println("Yes It is palindrom");
      } else {
         System.out.println("Not it is not palindrom");
      }

   }
}
