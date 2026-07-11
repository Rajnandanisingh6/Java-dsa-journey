package conditional;

import java.util.Scanner;

public class EligibleToVote {

	public static void main(String[] args) {
		
//		3. Eligible to Vote
//
//		Input age.
//
//		If age ≥ 18 print
//
//		Eligible to Vote
//
//		otherwise
//
//		Not Eligible
		
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the age");
	  int age = sc.nextInt();
	  if(age >= 18) {
		  System.out.println("Eligible to Vote");
	  }else {
		  System.out.println("Not Eligible to Vote");
	  }
	  sc.close();
	}
}
