
public class ReverseNumber {

	public static void main(String[] args) {
		int n = 12345678;
		reverseNum(n);
	}
	static void reverseNum(int n) {
		int sum = 0;
		while(n>0) {
			int x = n%10;
			sum = sum*10 + x;			
			n = n/10;
			
		}
		System.out.println("Your reverse number is:"+ sum);
	}

}
