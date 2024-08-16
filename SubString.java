package assignment27;

import java.util.Scanner;

public class SubString 
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Prompt the user to enter the substring to check
        System.out.print("Enter the substring to check: ");
        String subString = scanner.nextLine();
       
        if (mainString.indexOf(subString) != -1)
        {
           
            System.out.println("The main string contains the substring.");
        } 
        else
        {
           
            System.out.println("The main string does not contain the substring.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
