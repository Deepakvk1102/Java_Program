import java.util.Scanner;

public class CurrentAccount extends Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		Scanner s = new Scanner(System.in);				
        System.out.println("Please enter the withdrawal amount");
        double amount = s.nextDouble();
        if (amount>50000) {
        	a.deductFee(amount);
        }
        else {
        a.totalAmount(amount);
        }
		
	}

}
