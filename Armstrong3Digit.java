import java.util.Scanner;

public class Armstrong3Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      System.out.println("Enter any number");
      int n = s.nextInt();
      int armstrongnum = armStrongNum(n);
      boolean ans = isArmStrong(n,armstrongnum );
      System.out.println(ans);
	}
    static int armStrongNum(int n) {
    	int amNumber = 0;
    	while(n>0) {
    		int x = n%10;
    		int cube = x*x*x;
    		amNumber = amNumber + cube;
    		System.out.println(cube);
    		n = n/10;
    	}
       	return amNumber;
    }
    
    static boolean isArmStrong(int a, int b) {
    	if (a==b) {
    		System.out.println("Your armstrong number is:"+ a);
    		return true;    		
    	}
    	return false;
    }
    
//    static int cube(int n) {
//    	return n*n*n;
//    }

}
