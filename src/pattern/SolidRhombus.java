package pattern;

public class SolidRhombus {

	public static void main(String[] args) {
		int n = 5;
		//outer loop 
		for(int row=1;row<=n;row++) {
			//for each row --> spaces, star
			//spaces
			for(int col=1;col<=n-row;col++) {
				System.out.print(" ");			
			}
			//star
			for(int col=1;col<=n;col++) {
				System.out.print("* ");
			}
			//move to next row
			System.out.println();
		}
		

	}

}
