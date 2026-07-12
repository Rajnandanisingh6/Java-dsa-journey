package loops;

import java.util.Scanner;

public class SumAllNum {

	public static void main(String[] args) {
//		7. Print the sum of all the numbers from 1 to n
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a n value");
		int n = sc.nextInt();
		
		int sum =0;
		for(int i =1;i<=n;i++) {
			sum = sum + i;
		}
		
		System.out.println("sum = " + sum);
		sc.close();

	}

}
