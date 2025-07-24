import java.util.Scanner;

public class DigitOccurences {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any multiple number digits");
		long n = s.nextLong();
		System.out.println("Enter the target number");
		int target = s.nextInt();
//		int count = numberOfOccurences(n, target);
		int count = countDigits2(n, target);
		System.out.println("Your number digits:"+ count );
	}
	static int numberOfOccurences(long n, int target) {
		int countOfDigits = countDigits(n);
		int count = 0;
		for(int i =0; i<=countOfDigits; i++) {
			long x = n%10;
			if(x==target) {
				count++;
			}
			n = n/10;
		}		
		return count;
	}

	static int countDigits(long n) {
		int count = 0;
		while(n>0) {
			count = count +1;
			n = n/10;
		}
		System.out.println("Your number count is:"+ count);
		return count;
	}
	
	static int countDigits2(long n, int target) {
		int count = 0;		
		while(n>0) {
			long x = n%10;
			if(x==target) {
				count++;
			}
			n = n/10;
		}
		return count;
	}

}
