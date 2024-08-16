package assignment27;

import java.util.Scanner ; 

public class SalesPerson 
{
	 public static void main(String[] args)
	 {
Scanner scanner = new Scanner(System.in);
        int[] salaryRanges = new int[9];
        
        System.out.print("Enter the number of salespeople: ");
        
        int numberOfSalespeople = scanner.nextInt();

        for (int i = 0; i < numberOfSalespeople; i++) 
        {
            System.out.print("Enter the gross sales for salesperson " + (i + 1) + ": ");
            int salary = (int)(200 + 0.09 * scanner.nextDouble());
            salaryRanges[Math.min((salary - 200) / 100, 8)]++;
        }
        scanner.close();  
        System.out.println("\nNumber of salespeople in each salary range:");
        String[] ranges = {"$200–299: ", "$300–399: ", "$400–499: ", "$500–599: ", 
                           "$600–699: ", "$700–799: ", "$800–899: ", "$900–999: ", "$1000 and above: "};
        for (int i = 0; i < salaryRanges.length; i++) 
        {
            System.out.println(ranges[i] + salaryRanges[i]);
        }
    }
}	 