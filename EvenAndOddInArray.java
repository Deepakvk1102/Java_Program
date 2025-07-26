package freshPrograms2;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class EvenAndOddInArray {
	
	
	static void evenAndOddNumInArray(int[] arr) {
		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				set1.add(arr[i]);
			}
			else {
				set2.add(arr[i]);
			}
		}		
		System.out.println("Your even numbers are: "+ set1);
		System.out.println("Your odd numbers are: "+ set2);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = {20, 10, 8, 7, 5, 4, 2, 5, 4, 5};
      evenAndOddNumInArray(arr);
	}

}
