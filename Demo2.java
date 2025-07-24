import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
	     int x = 0;
	     int a = 0;
	     int countDig = 1;
	     int countChar = 1;
		for(int i =1; i<=18; i++) {
			Scanner s = new Scanner(System.in);
			if(countDig<=8) {
				x = x*10+s.nextInt();
				countDig++;
			}
			if(countChar<=10) {
				a = a + s.next().charAt(0);
				countChar++;
			}
			
		}
		System.out.println("Your answer is:"+ x);
	}
	
}





//3124234
//
//x --> 0
//Y --> user entered value
//
//count = 8
//
//x = x*10+y 
//count++    3*10+1 = 31
//
//dsfsfsf
//
//x = x + y
