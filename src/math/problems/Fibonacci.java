package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int a = 0;
        int b = 1;
        int c =a+b ;
        System.out.println("fibonacci number up to 40: ");
        for (int x = 0; x <= 40; x++) {
            a = b; b = c; c = a + b;
            System.out.print( a +" ");

        }
    }
}






