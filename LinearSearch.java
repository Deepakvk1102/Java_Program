
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 12, 13, 334, 45, 234};
		int target = 92;
		int ans = linearSearch(arr, target);
		System.out.println(ans);
	

	}
     static int linearSearch(int[] arr, int target) {
    	 for(int element: arr) {
    		 if(element == target) {
    			 System.out.println("element"+ element);;
    		 }
    	 } 	 
    	 return target;
     }
}
