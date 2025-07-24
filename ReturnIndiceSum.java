import java.util.Arrays;

public class ReturnIndiceSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 6, 5, 6, 8};
		int target = 11;
		returnIndex(arr, target);
	}
	static void returnIndex(int[] arr, int target) {
		
		for(int i = 0; i<arr.length-1; i++) {
			int firstnum = arr[i] + arr[i+1];
			if(firstnum == target) {
				int[] arr1 = new int[2];
				arr1[0] = i;
				arr1[1] = i+1;
				System.out.println("Your indices are:"+ Arrays.toString(arr1));
			
		    }
			
		}
	}

}
