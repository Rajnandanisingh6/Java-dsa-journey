package arrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		
		//array
		int []arr = new int[n];
		//array ke elements input lo
		System.out.println("Enter array elements:" );
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//Maximum
		int max = arr[0];
		for(int i =1;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum element = " + max);
		
      sc.close();
	}
	

}
