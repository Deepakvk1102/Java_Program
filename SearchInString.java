import java.util.Scanner;

public class SearchInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
        String name = s.next();
        System.out.println("Enter your target character");
        char target = s.next().charAt(0);
        int ans = searchInString(name, target);
        System.out.println("Your answer is:"+ ans);
	}
        static int searchInString(String name, char target) {
        	int count = 0;
        	for(int i = 0; i<name.length(); i++) {
        		if(name.charAt(i)==target) {
        			count = count+1; 
        			continue;
        		}
        		
        		        	}  	
        	return count;
        
        }
}
