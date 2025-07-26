package freshPrograms2;

import java.util.ArrayList;
import java.util.Iterator;

public class FirstLetterString {
     
	static String firstLetterOfWords(String s) {
		Character firstLetter = s.charAt(0);		
		String convertedString = firstLetter.toString();
		return convertedString;
	}
	
	public static void main(String[] args) {
     String s = "This is a string to test first letter";
     String[] splittedWords = s.split(" ");
     ArrayList<String> arr = new ArrayList<String>();
     for(String string: splittedWords) {
    	 arr.add(string);
     }
     Iterator<String> iterator = arr.iterator();
     while(iterator.hasNext()) {
    	String firstletter = firstLetterOfWords(iterator.next());
    	System.out.print(firstletter);
    	System.out.print(" ");
     }
	}
}