import java.util.Arrays;
import java.util.Scanner;

public class MaxIn2DArray {
	
	static void inputNumbers(int[][] arr) {
	Scanner s = new Scanner(System.in);
		for(int row = 0; row<arr.length; row++) {
			for(int col = 0; col< arr[row].length; col++) {
				arr[row][col] = s.nextInt();
			}
		}
	}
	static void findMaxnum(int[][] arr) {
		int maxNum = arr[0][0];
		for(int row = 0; row<arr.length; row++) {
			for(int col = 0; col<arr[row].length; col++) {
				if(arr[row][col]>maxNum) {
					maxNum = arr[row][col];
				}
			}			
			}
		System.out.println("Maximum number is:"+ maxNum);
	}
	/*
	 * To print the array
	 * 	for(int row = 0; row<arr.length; row++) {
		System.out.println(Arrays.toString(arr[row]));
		}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2D numbers");
		int[][] arr = new int[3][2];
		inputNumbers(arr);	
		findMaxnum(arr);		
	}
}