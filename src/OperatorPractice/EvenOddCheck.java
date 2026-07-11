package OperatorPractice;

import java.util.Scanner;

public class EvenOddCheck {
	public static void main(String[] args) {
//		Problem:
//			Input an integer and check whether it is even or odd.
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number");
		 int num =sc.nextInt();
		 if(num%2==0) {
			 System.out.println("This number is even:"+ num );
		 }else {
			 System.out.println("This number is odd :" +num);
		 }
		 sc.close();
		 

	}

}
