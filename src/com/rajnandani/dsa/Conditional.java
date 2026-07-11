package com.rajnandani.dsa;

public class Conditional {

	public static void main(String[] args) {
//		int dailyPractice = 12;
//		if(dailyPractice >= 10) {
//			System.out.println("Good Consistency");	
		//------------------------------------------
//		int score = 42;
//		if(score >=50) {
//			System.out.println("Pass");
//			
//			}else {
//				System.out.println("Fail");
//			}
		
		//------------------------------------------------
		
		int streakDay = 35;
		String status =(streakDay >= 30) ? "Consistent" : "Inconsistent";
		System.out.println(status);
	}

}
