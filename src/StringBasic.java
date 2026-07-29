import java.io.InputStream;
import java.util.Scanner;

public class StringBasic {

	 static void printString(String str) {
		//Print each character of the String
		int n = str.length();
		for(int i =0;i< n;i++) {
			char ch =str.charAt(i);
			System.out.println(ch);
		}
		
		

	}
	 public static void main(String [] args) {
		 String str = "Riya";
		 printString(str);
		 
	 }

	
}
