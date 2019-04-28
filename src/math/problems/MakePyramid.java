package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */

        for (int a= 0;a<10;a++) { //for my rows

            for (int b = 8; b>= a; b--) {//for spaces
                System.out.print(" ");
            }
            for (int c = 0; c <=a; c++) {//for stars *
                System.out.print(" *");
            }
            System.out.println("");

        }
    }
}
