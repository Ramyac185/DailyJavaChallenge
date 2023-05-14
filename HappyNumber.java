package javachallenge;

public class HappyNumber {
	public static boolean isNumberHappy(int n) {
		
		int d;
		int sum = n, num = n;
		
		if(num == 1 || num == 7)
			return true;
		while(sum > 9) {
			sum = 0;
			
			while(num > 0) {
				d = num%10;
				sum += d*d;
				num = num/10;
			}
			num = sum;
		}
		
		if(sum == 1 || sum == 7)
			return true;		
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println(isNumberHappy(19));
	}

}
