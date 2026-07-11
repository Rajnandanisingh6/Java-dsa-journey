package conditional;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
//		5. Divisible by 5 and 11
//
//		Input a number.
//
//		Check whether it is divisible by both 5 and 11.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		if(num%5 ==0 && num% 11 ==0) {
			System.out.println("it is divisible by both 5 and 11");		
		}else {
			System.out.println("it is not divisible by both 5 and 11");
		}
		sc.close();
	}

}
