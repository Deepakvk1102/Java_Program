package freshPrograms2;

import java.util.ArrayList;

public class ReverseWords {
    
	
	static String reversedWord(String a) {		
		String reverse = "";
		for(int i=a.length()-1; i>=0; i--) {
			reverse = reverse + a.charAt(i);
		}
		return reverse;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "This is a new string to be reversed";
		String[] splittedWords = s.split(" ");
		ArrayList<String> reversed = new ArrayList<String>();		
		for(String word: splittedWords) {
			reversed.add(reversedWord(word));
		}
		System.out.println("Reversed word is: "+ reversed);
		

	}

}
