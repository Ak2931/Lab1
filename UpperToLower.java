package assignment27;

import java.util.Scanner;

public class UpperToLower
{

	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");	        // Prompt user for input

	        String input = scanner.nextLine();

	        String upperCase = input.toUpperCase();	        // Convert the string to upper case

	        System.out.println("Upper Case: " + upperCase);

	        String lowerCase = input.toLowerCase();	        // Convert the string to lower case

	        System.out.println("Lower Case: " + lowerCase);

	        scanner.close();
	}

}
