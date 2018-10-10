package pg31;

public class Pg31 {
	public void chickBoom() {
		for(int i = 0; i < 12; i++) {
			System.out.println(i+1);
			System.out.println("chick");
			System.out.println("boom");
			System.out.println("chick");
		}
	}
	public static int fibonacci(int num) {
		int prev = 0;
		int curr = 1;
		int fib = 0;
		if(num == 0) {
			return 0;
		}
		if(num == 1) {
			return 1;
		}
		for(int i = 1; i < num; i++) {
			fib = prev + curr;
			prev = curr;
			curr = fib;
		}
		return fib;
	}
	public static int sumToOne(int num) {
		int sum = 10;
		while(sum > 9) {
			sum = 0;
			while(num > 9) {
				sum+=num%10;
				num/=10;
			}
			sum+=num;
			num=sum;
		}
		return sum;
	}
	public static Boolean isPrime(int num) {
		for(int i = num-1; i > 1; i--) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
}
