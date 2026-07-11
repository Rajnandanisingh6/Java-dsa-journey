package conditional;

import java.util.Scanner;

public class GreatestThree {

	public static void main(String[] args) {
		
//		Level 3 (else-if)
//		7. Greatest of Three Numbers
//
//		You already know this one.
//
//		Try solving it without looking at the previous solution.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter a Second Number");
		int num2 = sc.nextInt();
		System.out.println("Enter a Third Number ");
		int num3 = sc.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("The Greatest Number is : " + num1);
		}else if(num2 >= num1 && num2 >= num3) {
			System.out.println("The Greatest Number is : " + num2);
		}else {
			System.out.println("The Greatest Number is :" + num3);
		}
		sc.close();


	}

}
