import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] array = new int[8];
		System.out.println("Enter your numbers");
		for (int i = 0; i<array.length; i++) {
			array[i] = s.nextInt();
//			System.out.println();
		}
		reverseArray(array);
		}
	static void reverseArray(int[] arr) {
		int[] revArray = new int[8];
		for (int i = revArray.length-1; i>=0; i--) {
			revArray[i] = arr[revArray.length-1-i];			
		}
		System.out.println("ReversArray:"+ Arrays.toString(revArray));
	}

}
