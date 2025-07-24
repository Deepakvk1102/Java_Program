import java.util.ArrayList;

public class Groceries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50, 60};
		int target = 100;
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {			
				ArrayList<Integer> list = new ArrayList<>(arr.length-1);
				sum = sum + arr[i];
				list.add(arr[i]);
				if(sum<=target) {
					System.out.print(list);
					System.out.println();
					continue;
				}
			}
		
		
		


	}

}
