package conditional;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
//		10. Electricity Bill
//
//		Input electricity units.
//
//		0-100 → ₹5/unit
//		101-200 → ₹7/unit
//		Above 200 → ₹10/unit
//
//		Calculate the bill.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Units");
		int unit = sc.nextInt();
		if(unit <0) {
			System.out.println("Invalis Units");
		}else if(unit >=0 && unit <= 100) {
			System.out.println("Bill is : "+ unit*5 +" Rs " );
		}else if(unit >=101 && unit <= 200) {
			System.out.println("Bill is : " + unit*7 +" Rs ");
		}else {
			System.out.println("Bill is : " + unit*10 +" Rs ");
		}
		sc.close();
		

	}

}
