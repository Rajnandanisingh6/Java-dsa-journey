package OperatorPractice;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		//Problem:
		//Input two integers and swap them without using any extra variable.
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		
		sc.close();

	}
	
}
