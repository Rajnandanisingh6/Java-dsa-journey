package pattern;

public class InvertedRightAngleTriangle {

	public static void main(String[] args) {
		int n =5;
		//outer loop
		for(int row = 1;row<=n;row++) {
			//for each row -> formula find n-r-1
			for(int col=1;col<=n-row+1;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
