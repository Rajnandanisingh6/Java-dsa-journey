package conditional;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
//		8. Student Grade
//		Input marks.
//		90-100 → A
//		80-89 → B
//		70-79 → C
//		60-69 → D
//		Below 60 → Fail
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Marks");
		int marks =  sc.nextInt();
		
		if(marks <0 || marks >100) {
			System.out.println("Invalid Marks");
		}
		if(marks >= 90) {
			System.out.println("A");
		}else if(marks >=80) {
			System.out.println("B");
		}else if(marks >=70) {
			System.out.println("C");
		}else if(marks >= 60 ) {
			System.out.println("D");
		}else {
			System.out.println("Fail");
		}
		sc.close();
	
	}

}
