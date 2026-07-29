package loops;

public class AllPrimeNum {

	public static void main(String[] args) {
//   // 5. Print all prime numbers from 1 to 100
//		for(int num =2;num<=100;num++) {
//		boolean	isPrime = true;
//		for(int i =2;i<num;i++) {
//			if(num % i==0) {
//				isPrime = false;
//				break;
//			}
//		}
//		if(isPrime) {
//			System.out.println(num + " ");
//		}
//			
//		}
		
		//----------------------------------------------------
		for(int num=2;num<=100;num++) {
			boolean isPrime = true;
			for(int i=2;i*i<=num;i++) {
				if(num % i ==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(num);
			}
			
		}          
		

	}

}
