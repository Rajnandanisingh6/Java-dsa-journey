package conditional;

import java.util.Scanner;

public class Calulator {

	public static void main(String[] args) {
		
//		9. Calculator
//
//		Input
//
//		Number 1
//		Operator (+,-,*,/)
//		Number 2
//
//		Perform the operation using if-else.
//
//		Example
//
//		10
//		+
//		20
//
//		Output
//
//		30
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First Number");
		int  number1 = sc.nextInt();
		System.out.println("Enter a operator");
		char operator = sc.next().charAt(0);
		System.out.println("Enter a Second Number");
		int number2 = sc.nextInt();		
		if(operator == '+') {
			System.out.println( number1 + number2);			
		}else if(operator == '-') {
			System.out.println( number1 - number2);	
		}else if(operator == '*') {
			System.out.println( number1 * number2);	
		}else if(operator == '/') {
			if(number2 !=0) {
				System.out.println( number1 / number2);	
			}else {
				System.out.println("Cannot divide by zero");
			}
			
		}else {
			System.out.println("Invalid User");
		}
		sc.close();
	}
}
