
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 5, 6, 7, 9, 25};
		int target = 8;
		int ans = binarySearch(arr, target);
		System.out.println("Your answer is:"+ ans);
	}
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		int mid =0;
		if(arr[start]<=arr[end])	{
			while(start<=end) {
			mid = start+(end-start)/2;
			if(target>arr[mid]) {
				start = mid+1;	
				
			}
			else if (target<arr[mid]){
				end = mid-1;
			}
			else if(target == arr[mid]) {
				return mid;
			}
			}
		}
//		else
//		{
//			while(start<end) {
//			mid = start+end/2;
//			if(target<mid) {
//				start = mid+1;
//			}
//			else if (target>mid){
//				end = mid-1;
//			}
//			
//			}
//		}
		return -1;	
	}

}

