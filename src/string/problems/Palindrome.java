package string.problems;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */




            {
                boolean isPalindrome = false;
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a string:");
                String userInput = scan.nextLine();
                userInput = userInput.trim().replaceAll(" ", "").toLowerCase();
                char[] array = new char[userInput.length()];
                char[] reverseArray = new char[userInput.length()];
                int i = 0;
                int j = userInput.length();

                do {
                    i++;
                    j--;

                    array[i] = userInput.charAt(i);
                    reverseArray[j] = userInput.charAt(j);

                    if (array[i] != reverseArray[j])
                    {
                        isPalindrome = false;
                    }
                    else
                    {
                        isPalindrome = true;
                    }

                } while (j > i);

                if(isPalindrome)
                {
                    System.out.println("It's not a palindrome.");
                }
                else
                {
                    System.out.println("It's a palindrome.");
                }
            }
        }
    }

