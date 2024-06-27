package assignment27;

import java.util.Scanner;

public class field_in_acres
{
	 public static void main(String[] args)
	 {
	       
	        final double SQUARE_FEET_PER_ACRE = 43560.0;

	        
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter the area of the field in square feet: ");
	        double squareFeet = scanner.nextDouble();

	       
	        double acres = squareFeet / SQUARE_FEET_PER_ACRE;

	      
	 System.out.printf("The area of the field is %.2f acres.%n", acres);
	    }
}
