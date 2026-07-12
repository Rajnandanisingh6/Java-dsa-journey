package pattern;

public class SquarePattern {

	public static void main(String[] args) {
		int n = 4;
		
		//outer loop for row
		for(int row =1; row<=n;row++) {
			//inner loop column
			for(int col =1;col<=n;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
