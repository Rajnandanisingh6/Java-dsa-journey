package OperatorPractice;

import java.util.Scanner;

public class SumOfThreeDigitNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three digit number");		
		int num = sc.nextInt();
		
		int last =(num%10);
		int middle = (num/10)%10;
		int first = (num/100);
		
		int sum = last + middle + first;
		System.out.println(sum);
		
		sc.close();

	}

}
