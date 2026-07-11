package OperatorPractice;

import java.util.Scanner;

public class LargestOneCheck {
	//Take 3 numbers and print the largest one.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int SecondNumber = sc.nextInt();
		int thirdNumber = sc.nextInt();
		
		if(firstNumber >SecondNumber && firstNumber > thirdNumber) {
			System.out.println(firstNumber);
		}else if( SecondNumber > firstNumber&& SecondNumber >thirdNumber ) {
			System.out.println(SecondNumber);
			
		}else {
			System.out.println(thirdNumber);
		}
		sc.close();

	}

}
