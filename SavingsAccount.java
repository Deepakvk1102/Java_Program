import java.util.Scanner;

public class SavingsAccount extends Account{
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please assume swiping your card by typing enter");
		String swipe = s.next();
		
		System.out.println("Username:" + a.userName);
		
		System.out.println("Enter type of transaction withdrawal (w) or deposit (d) or intrest (i)");
		String type = s.next();
		
		if (type.equalsIgnoreCase("w")) {			
        System.out.println("Please enter the withdrawal amount");
        double amount = s.nextDouble();
        a.totalAmount(amount);
		}
		else if (type.equalsIgnoreCase("d")) {
			System.out.println("Please enter the deposit amount");
	        double amount = s.nextDouble();
	        a.totalAmountDeposit(amount);
		}
		else if (type.equalsIgnoreCase("i")) {
			a.calculateInterest();
		}
		
	}

}
