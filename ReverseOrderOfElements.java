package freshPrograms2;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseOrderOfElements {


	static void reverseOrder(ArrayList l) {		

		ListIterator<Integer> list = l.listIterator(l.size());
		while(list.hasPrevious()) {
			System.out.print(list.previous());
			System.out.print(" ");
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(21);
		list.add(29);
		list.add(42);
		list.add(35);
		list.add(64);
		list.add(71);
		list.add(78);
		list.add(92);
		System.out.println(list);
		reverseOrder(list);

	}

}
