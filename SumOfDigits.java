package freshPrograms2;

public class SumOfDigits {
	static int sumOfDigits(int x) {
		int sum = 0;

		while (x>0) {
			int s = x%10;
			sum = sum + s;
			x = x/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 12345;
		int addedValue = sumOfDigits(n);
		System.out.println("Your answer is: "+ addedValue);
	}
}