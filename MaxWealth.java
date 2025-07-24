import java.util.Arrays;
import java.util.Scanner;

public class MaxWealth {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[1, 2, 3]
		//[3, 4, 5]
		Scanner s = new Scanner(System.in);		
		int[][] arr = new int[2][3];		
		int maxWealth = 0;
		for(int row = 0; row<arr.length; row++) {
			System.out.println("Enter the wealth of "+ (row+1) + " person");
			int personSum = 0;
			for(int col = 0; col<arr[row].length; col++) {
				arr[row][col] = s.nextInt();
				personSum = personSum + arr[row][col];	
			}
			if(personSum > maxWealth) {
				maxWealth = personSum;
			}
		}
	
	System.out.println("The richest person wealth is:"+ maxWealth );
}	
}

