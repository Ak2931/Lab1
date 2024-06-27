package assignment27;

import java.util.Scanner;

public class FarmerField
{
	public static void main(String[] args)
	{
     
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the length of the field in feet: ");
        double length = scanner.nextDouble();

       
        System.out.print("Enter the width of the field in feet: ");
        double width = scanner.nextDouble();

       
        double area = length * width;

        
        System.out.println("The area of the field is " + area + " square feet.");

        
        scanner.close();
    }
}
