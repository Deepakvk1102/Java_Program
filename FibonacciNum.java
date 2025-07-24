import java.util.Scanner;

public class FibonacciNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the nth number to print fibonacci series");
        int n = s.nextInt();
        int ans = fibonacciNumber(n);
        System.out.println("Your fibonacci number is:"+ ans);
	}
	// 0 1 1 2 3 5 8
	static int fibonacciNumber(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		if(n==0 || n==1) {
			return n;
		}
		else {
		for(int i=2; i<=n; i++) {
			c = a+b;
			a=b;
			b=c;
		}
		return c;
		}
	}

}
