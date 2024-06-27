package assignment27;

public class CelsiusToFahrenheit 
{
	 public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter temperature in Celsius: ");
	        double celsius = scanner.nextDouble();
	        
	        double fahrenheit = celsius * 1.8 + 32;
	        
	        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
	        
	        scanner.close();
	    }

}
