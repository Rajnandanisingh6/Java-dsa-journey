package com.rajnandani.dsa;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		
		
//		Arithmetic Operators
		
//		1.Input two numbers and print their sum, difference, product, quotient, and remainder.
	//	Scanner sc = new Scanner(System.in);
		
		
		
		
		
//		Input the length and breadth of a rectangle. Find its area and perimeter.
//		Input the radius of a circle. Find its area and circumference.
//		Convert temperature from Celsius to Fahrenheit.
//		Input a three-digit number and print the sum of its digits.
		
		//Problem:
		//Input a 3-digit number and print the sum of its digits.
		
		//solution 
		//logic 
		// phale ak input lenege user se jo 3 digit ka ak number ho
		// fir sare digit ka sum chahiye 
		// ham kya karenge ki last digit le kar aayenge kaise % help se fir last digit ko remove kar denge
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three digit number");
		int num = sc.nextInt();
		int digit1 = num % 10; // this line help to find last digit of a number
		num = num/10;          // this line help to remove the last digit
		int digit2 = num %10;
		num = num/10;
		int digit3 = num %10;
		num = num/10;
		
		int sum = digit1 + digit2 + digit3;
		System.out.println(sum);
		
		sc.close();

	}

}
