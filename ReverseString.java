import java.util.Scanner;

public class ReverseString {
	
    static String reverseOf(String x) {
    	String original = x;
    	String reverse = "";
    	for (int i = original.length()-1;i>=0;i--) {
    		reverse = reverse + original.charAt(i);    		
    	}
    	return reverse;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
       System.out.println("Enter any words:");
       String a = s.next();
       reverseOf(a);
       System.out.println("Your reversed string is:"+" "+reverseOf(a));
	}
}
