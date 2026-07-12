package loops;

import java.util.Scanner;

public class MultipleOfN {

	public static void main(String[] args) {
//		3. Print the 10 multiples of n
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		for(int i =1;i<=10;i++) {
			System.out.println(n * i);
		}
		sc.close();
	}

}
