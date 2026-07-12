package pattern;

public class Test {

	public static void main(String[] args) {
		int n = 4;
		for(int row =1; row<=n;row++) {
			//spaces
			for(int col =1;col<=row-1;col++) {
				System.out.print("  ");
			}
			//star
			for(int col=1;col<= 2*n-2*row+1;col++) {
				System.out.print("* ");
			}
			//move to next row
			System.out.println();
		}

	}

}
