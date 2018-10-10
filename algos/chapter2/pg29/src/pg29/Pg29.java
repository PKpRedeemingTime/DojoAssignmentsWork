package pg29;

public class Pg29 {
	public static int sigma(int num) {
		int ans = 0;
		for(int i = 1; i < num+1; i++) {
			ans+=i;
		}
		return ans;
	}
	public static int factorial(int num) {
		int ans = 1;
		for(int i = 1; i < num+1; i++) {
			ans*=i;
		}
		return ans;
	}
	public void drawLeftStars(int num) {
		String a = "";
		for(int i = 0; i < num; i++) {
			a+="*";
		}
		System.out.println(a);
	}
	public void drawRightStars(int num) {
		String a = "";
		int beg = 75-num;
		for(int i = 0; i < beg; i++) {
			a+=" ";
		}
		for(int i = 0; i < num; i++) {
			a+="*";
		}
		System.out.println(a);
	}
	public void drawCenteredStars(int num) {
		String a = "S";
		int beg = (75-num)/2;
		for(int i = 0; i < beg; i++) {
			a+=" ";
		}
		for(int i = 0; i < num; i++) {
			a+="*";
		}
		for(int i = 0; i < 75-(beg+num); i++) {
			a+=" ";
		}
		a+="E";
		System.out.println(a);
	}
}
