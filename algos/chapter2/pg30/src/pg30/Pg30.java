package pg30;

public class Pg30 {
	public void threesAndFives(int start, int end) {
		int sum = 0;
		for(int i = start; i < end+1; i++) {
			if(i%3 == 0 || i%5 == 0) {
				if(i%3 == 0 && i%5 == 0) {
					continue;
				}
				else {
					sum+=i;
				}
			}
		}
		System.out.println(sum);
	}
	public void generateCoinChange(int cents) {
		int total = cents;
		int quarters = cents/25;
		cents = cents%25;
		int dimes = cents/10;
		cents = cents%10;
		int nickels = cents/5;
		cents = cents%5;
		System.out.println(total + " cents can be represented by:");
		System.out.println("quarters: " + quarters);
		System.out.println("dimes: " + dimes);
		System.out.println("nickels: " + nickels);
		System.out.println("pennies: " + cents);
	}
	public static int messyMath(Double num) {
		int sum = 0;
		for(int count = 0; count < num+1; count++) {
			if(count == num/3) {
				return -1;
			}
			else if(count%3 == 0) {
				continue;
			}
			else if(count%7 == 0) {
				sum = sum+count+count;
			}
			else {
				sum+=count;
			}
		}
		return sum;
	}
}
