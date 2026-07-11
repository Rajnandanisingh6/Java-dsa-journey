package conditional;

import java.util.Scanner;

public class GreaterTwoNum {

	public static void main(String[] args) {
		
//		Level 2 (if-else)
//		4. Greatest of Two Numbers
//
//		Input two integers and print the greater number.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("Greater Number is: " + num1);
		}else if(num2 > num1){
			System.out.println("Greater Number is: " + num2);
		}else {
			System.out.println("Both are equals");
		}
		sc.close();

	}

}
