

public class Account {
	String userName = "Maru";
	double balance = 70000;
	
	void totalAmount(double amountWithdrawn) {
		double totalAmount = balance - amountWithdrawn;
		System.out.println("Your Balance amount is:"+ totalAmount);
	}
	
	void totalAmountDeposit(double amountDeposit) {
		double totalAmount = balance + amountDeposit;
		System.out.println("Your Balance amount is:"+ totalAmount);
		
	}
	
     void calculateInterest() {
    	 double totalAmount = balance + (0.7*balance);
    	 System.out.println("Your total balance with intrest is:" + totalAmount);
     }
     
     void deductFee(double amount) {
    	 double balanceAmount = balance - amount - 5;
    	 System.out.println("Your total balance is:" + balanceAmount);
     }
	
}
