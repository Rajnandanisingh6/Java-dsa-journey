package arrays;

import java.util.Scanner;

public class MinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = sc.nextInt();
		//array 
		int[] arr = new  int[n];
		System.out.println("Enter array of element:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//min
		int min =arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min =arr[i];
			}
		}
		System.out.println("Minimum element: " + min);

	}

}
