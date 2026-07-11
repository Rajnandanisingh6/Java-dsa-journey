package conditional;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
//		6. Leap Year
//
//		Input a year.
//
//		Print whether it is a leap year or not.
//
//		(Hint: Use % operator and conditions.)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year");
		int year = sc.nextInt();
		if(year % 4 == 0 && year % 100 != 0  || ( year % 400 ==0 ) ){
			System.out.println("Leap Year");
		}else {
			System.out.println("Not a Leap year");
		}
		sc.close();

	}

}
