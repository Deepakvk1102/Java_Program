import java.util.Scanner;

public class ReverseNumbers {
	
	static int reverseOf(int x){
	int rev = 0;
	while(x>0) {
	 int r = x%10;
	 rev = rev * 10 + r;
	 x = x/10;
	}
	return rev;
	}
	
	static void IsPalindrome(int x, int y) {
		if (x == y) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
        int reversenum = reverseOf(n);
        System.out.println("reverse number is:"+" "+ reverseOf(n));
        IsPalindrome(reversenum, n);
	}


}
