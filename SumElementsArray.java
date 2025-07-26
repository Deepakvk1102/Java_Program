package freshPrograms2;

public class SumElementsArray {


	static int getSumOfArray(int[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
		}		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {20, 30, 40, 50, 100, 10, 3};
		int ans = getSumOfArray(arr);
		System.out.println("Your sum of array is: "+ ans);
	}

}
