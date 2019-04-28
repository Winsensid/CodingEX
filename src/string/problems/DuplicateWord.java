package string.problems;

import java.util.Arrays;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";


            String word[] = st.split(" ");
            int count=0;
            for( int i=0;i<word.length;i++)
            {
                for( int j=0;i<word.length;j++)
                {
                    if(word[i]==word[j])
                    {
                        count++;
                    }
                    System.out.println("the word is "+word[i]);

                    String[] array = {"Java", "is", "a", "programming", "Language", "Java", "is", "also", "an", "Island", "of", "Indonesia", "Java", "is", "widely", "used", "language"};
                    StringBuilder builder = new StringBuilder();
                    for(String s : array) {
                        builder.append(s);
                    }

                    System.out.println((float)builder.toString().length() / array.length);
                }

            }

        }
    }

