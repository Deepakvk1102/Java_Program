import java.util.Scanner;

public class Employee {
     String Designation;
     double MonthlySalary;
              
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first name");		
		String firstName = s.next();
		System.out.println("Enter the last name");
		String lastName = s.next();
		System.out.println("Enter the employee id");
		String EmployeeId = s.next();
		System.out.println("Enter the experience");
		int experience = s.nextInt();
		System.out.println("Enter the salary");
		double salary = s.nextDouble();
		if (experience >= 3 && experience <= 5 ) {
			System.out.println(firstName + " " + lastName + " "+ "Yours designation is team lead and your hike percentage is 10%");
			System.out.println("Your annual income is:"+ " "+ salary*12);
		}
		else if (experience >= 6 && experience <= 10 ) {
			System.out.println(firstName + " " + lastName + " " + "Yours designation is Manager and your hike percentage is 20%");
			System.out.println("Your annual income is:"+ " "+ salary*12);
		}
		else if (experience < 3) {
			System.out.println(firstName + " " + lastName + " " + "Yours designation is Engineer and your hike percentage is 0%");
			System.out.println("Your annual income is:"+ " "+ salary*12);
		}
		else {
			System.out.println("Sorry you are terminated from IT field");
		}
		
		
				
	}

}
