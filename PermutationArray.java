import java.util.Arrays;

public class PermutationArray {
  //INPROGRESS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {0,2,1,5,3,4};
        int[] ans = permutation(arr);
        System.out.println("Your answer is:"+ Arrays.toString(arr));
	}
	static int[] permutation(int[] arr) {
//		int[] newArr = new int[arr.length-1];
//		newArr[0] = 0;
////		int a = 0;
	    for(int i = 0; i<arr.length; i++) {
	    	for(int j =1; j<arr.length-1; j++ )
	    	if(arr[i]>arr[j]) {
	    		arr[j] = arr[i];
	    		i++;
	    	}
	    	
	    }
	    return arr;
	}

}
