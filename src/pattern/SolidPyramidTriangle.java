package pattern;

public class SolidPyramidTriangle {

	public static void main(String[] args) {
		
		int n= 5;
		for(int row=1;row<=n;row++) {
			//for each row -> variable 
			//spaces
			for(int col=1;col<=n-row;col++) {
				System.out.print("  ");
			}
			//star
			for(int col=1;col<=2*row-1;col++) {
				System.out.print("* ");
			}
			//move to next row
			System.out.println();
		}

	}

}
