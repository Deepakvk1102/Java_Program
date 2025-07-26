package freshPrograms2;

public class SumDigits {
    
	static int sumOfDigits(int n) {
		int sum = 0;
		while(n>0) {
			int x = n%10;
			sum = sum + x;
			n = n/10;
		}	
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = sumOfDigits(88);
		System.out.println("Your answer is: "+ ans);
	}

}
