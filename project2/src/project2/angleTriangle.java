package project2;

import java.util.Scanner;

public class Angtriangle {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		System.out.println("enter angles");
		int a1=t.nextInt();
		int a2=t.nextInt();
		int a3=t.nextInt();
		int angleSum = a1 + a2 + a3;
		if (angleSum == 180 && a1 > 0 && a2 > 0 && a3 > 0) {
	           if (a1 < 90 && a2 < 90 && a3 < 90) {
	               System.out.println("Acute-angled Triangle");
	           }
	           else if (a1 == 90 || a2 == 90 || a3 == 90) {
	               System.out.println("Right-angled Triangle");
	           }
	           else {
	               System.out.println("Obtuse-angled Triangle");
	           }
	       }
	       else {
	           System.out.println("Triangle not possible");
	       }
		
		// TODO Auto-generated method stub

	}

}
