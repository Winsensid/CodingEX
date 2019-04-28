package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String str1 = "ARMY";
        String str2 = "MARY";

        System.out.println("ARMY and AMY are anagrams" + " : " + anagramMethod(str1, str2));


    }


    public static boolean anagramMethod(String str1, String str2) {

        char[] ArrayofCharFromString1 = str1.toCharArray();
        char[] ArrayofCharFromString2 = str2.toCharArray();


        Arrays.sort(ArrayofCharFromString1);
        Arrays.sort(ArrayofCharFromString2);


        return Arrays.equals(ArrayofCharFromString1, ArrayofCharFromString2);

    }
}









