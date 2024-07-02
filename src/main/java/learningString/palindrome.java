package learningString;

import java.util.Scanner;

public class palindrome
{
    public static void main(String args[])
    {
    	String original, reverse = ""; // Objects of String class
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter a string to check if it is a palindrome");
        original = sc.nextLine();
   
        int length = original.length();
   
        for ( int i = length - 1; i >= 0; i-- )
           reverse = reverse + original.charAt(i);
   
        if (original.equals(reverse))
           System.out.println("Entered string is a palindrome.");
        else
           System.out.println("Entered string is not a palindrome.");
    }
}