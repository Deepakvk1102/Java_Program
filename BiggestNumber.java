public class BiggestNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {35, 56, 46, 59, 108, 78, 32};
		int big = ar[0];
		for(int i=2; i<=ar.length-1; i++) {
			if(big<ar[i]) {
				big = ar[i];				
			}			
		}
		System.out.println("The biggest number is:"+" "+big);
	}
}