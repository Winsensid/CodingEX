package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         */
    }

    private static void permutation(String prefix, String str) {
        int a = str.length();
        if (a == 0) {

            System.out.println(prefix);

        } else {

            for (int x = 0; x < a; x++) {
                permutation(prefix + str.charAt(x), str.substring(0, x) + str.substring(x + 1, a));
            }

        }


    }
}






