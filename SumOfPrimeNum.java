package freshPrograms2;

//Prime number ==> 1,2,3,5,7,11,13,17,19.... ==> Num divisible by itself and by 1
public class SumOfPrimeNum {

	static int sumOfPrime(int x) {
		int sum = 0;
		for(int i=0; i<x; i++) {
			sum = sum + primeNum(i);
		}
		return sum;
	}

	static int primeNum(int n) {
		if(n<=1) {
			return 0;
		}
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				return 0;
			}			
		}
		return n;
	}

	public static void main(String[] args) {
		int n = 10;
		int sumOfPrimeNum = sumOfPrime(n);
		System.out.println("Sum of prime number is "+sumOfPrimeNum);
	}
}