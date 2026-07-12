package loops;

public class Test {

	public static void main(String[] args) {
	//	Print all prime numbers from 100 to 200.
		for(int num=100;num<=200;num++) {
			boolean isPrime = true;
			for(int i=2;i*i<=num;i++) {
				if(num % i==0) {
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
