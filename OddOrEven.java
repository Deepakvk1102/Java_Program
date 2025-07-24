import java.util.Scanner;

public class OddOrEven {
	
	static void oddEven(int x) {
		if (x%2 == 0) {
			System.out.println("Entered number is even");
		}
		else {
			System.out.println("Entered number is odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = s.nextInt();
		oddEven(n);

	}		
}
