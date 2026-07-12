package loops;

import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		
//		HOMEWORK -
//
//		Loop Homework:
//
//		1. Print counting from 1 to n
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a n value");
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			System.out.println(i);
			
			
		}
		sc.close();
		
	}

}
