package com.rajnandani.dsa;

public class DataTypes {

	public static void main(String[] args) {
		//Numeric DataTypes - short,byte,int,long
		
		byte num1 =127; // range -128 to 127
		System.out.println(num1);
		
		short num2 = 500;
		System.out.println(num2);
		
		int num3 = 4563;
		System.out.println(num3);
		long num4 = 8593638;
		System.out.println(num4);
		
		//floating data types
		
		float num5 = 3.14f;
		System.out.println(num5);
		
		double num6 =3.242424;
		System.out.println(num6);
		
		//other - char , Boolean
		boolean eligibleToVote =true;
		System.out.println(eligibleToVote);
		
		char firstCharacter ='a';
		System.out.println("My First Character is: "+(char)(firstCharacter+2));
		
		//Type Casting 
		//1. Implicit 
		byte num7 = 12;
		int newnum =num7;
		System.out.println(newnum);
		
		//explicit 
		long value1 = 12342345;
		int value2 =(int) value1;
		System.out.println(value2);
		
		 
		
	}

}
