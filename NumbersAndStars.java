import java.util.Scanner;

public class NumbersAndStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
       System.out.println("Enter any number:");
       int n = s.nextInt();
       for(int i=1; i<=n; i++) {
    	   for(int j=1; j<=n-1; j++) {
    		 System.out.println(" "); 
    	   }
    		 for(int k=1; k<2*i-1; k++) {
    			
    		 }
    	   
       }
	}

}
