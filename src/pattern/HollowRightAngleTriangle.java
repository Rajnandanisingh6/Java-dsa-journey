package pattern;

public class HollowRightAngleTriangle {

	public static void main(String[] args) {
		int n = 5;
		for(int row=1;row<=n;row++) {
			//star
			if(row==1 || row==2|| row ==n) {
				for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			 }else {
				 //middle rows
				 //1 star
				 System.out.print("* ");
				 //spaces (row-2)
				 for(int col=1;col<=(row-2);col++) {
					 System.out.print("  ");
				  }
				 //1 star
				 System.out.print("* ");
					
				}
			System.out.println();
				
			}
		}

	}


