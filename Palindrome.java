package assignment27;

import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Close the scanner to prevent resource leaks
        scanner.close();
   
        String reversed = new StringBuilder(input).reverse().toString();
        
        if (input.equalsIgnoreCase(reversed))
        {
            
            System.out.println("The string \"" + input + "\" is a palindrome.");
        }
        else 
        {
           
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }
}
