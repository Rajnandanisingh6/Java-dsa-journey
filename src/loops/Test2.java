package loops;

public class Test2 {

	public static void main(String[] args) {
		//10. Count how many numbers from 1 to 100 are divisible by 7.
		int count = 0;
		for(int num =1;num<=100;num++) {
			if(num % 7 ==0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
