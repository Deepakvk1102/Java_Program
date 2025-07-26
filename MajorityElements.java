package freshPrograms2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MajorityElements {
	
	
	static void majorityElement(int[] a) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num: a) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		int big = 0;
		int majorityElement = 0;
		for(Map.Entry<Integer, Integer> value: map.entrySet()) {
			if(value.getValue() > big) {
				big = value.getValue();
				majorityElement = value.getKey();
			}
		}
	    System.out.println("Majority element:" + majorityElement);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = {1,1,1,1,1, 2, 3, 5, 5, 7, 7,7,7,7,7,7,7,7, 7, 9, 9,20, 20, 20, 20, 20, 20, 20};
      majorityElement(arr);
	}

}
