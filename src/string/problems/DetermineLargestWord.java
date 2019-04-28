package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";

        String[] word = s.split(" "); /*won't  take into consideration spaces*/
        String maxlethWord = ""; /*word does not have spaces*/
        for (int i = 0; i < word.length; i++) { /* i= first index "human"*/
            if (word[i].length() >= maxlethWord.length()) {
                maxlethWord = word[i];
            }
        }
        System.out.print(maxlethWord.length() + " " + maxlethWord);


    }


}




