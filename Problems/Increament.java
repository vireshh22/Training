package Problems;
public class Increament {
    public static void main(String[] args) {
        // for(int i=0;i<10;System.out.println(++i)){}

        // if (System.out.printf("Hello") != null) {
        // System.out.println("World");
        // } else {
        // System.out.println("World");
        // }

        // System.out.printf("1");

        int a = 10;
        int b = 2;
        int temp = a;

        while (a > b) {
            a--;
        }
        System.out.println(a);

        while (b < temp) {
            b++;
        }
        System.out.println(b);

    }
}
