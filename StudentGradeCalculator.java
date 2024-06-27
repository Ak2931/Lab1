package assignment27;
import java.util.Scanner;

public class StudentGradeCalculator
{
	 public static void main(String[] args)
	 {
	        Scanner scanner = new Scanner(System.in);
	        int[] marks = new int[5];
	        int total = 0;

	       
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Enter marks for subject " + (i + 1) + ": ");
	            marks[i] = scanner.nextInt();
	            total += marks[i];
	        }

	      
	        double average = total / 5.0;

	       
	        char grade;
	        if (average >= 90) {
	            grade = 'A';
	        } else if (average >= 80) {
	            grade = 'B';
	        } else if (average >= 70) {
	            grade = 'C';
	        } else if (average >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }

	        
	        System.out.println("Average Marks: " + average);
	        System.out.println("Grade: " + grade);
	    }
	}

