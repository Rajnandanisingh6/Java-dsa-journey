package conditional;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		
//		Level 1 (Single if)
//		1. Positive, Negative or Zero
//
//		Input an integer and print whether it is:
//
//		Positive
//		Negative
//		Zero
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		if(a >0) {
			System.out.println("Positive");
		}else if(a <0) {
			System.out.print("Negative");
		}else {
			System.out.println("Zero");
		}
		sc.close();

	}

}
