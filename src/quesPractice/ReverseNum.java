package quesPractice;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int reverse =0;
	      while (num > 0) {

	            // 1. Last digit nikalo
	    	int  lastdigit = num%10;

	            // 2. Reverse update karo
	    	reverse = reverse*10 + lastdigit;

	            // 3. Number ko chhota karo
	    	num=num/10;
	    	
	}
	      System.out.println(reverse);
	}

}
