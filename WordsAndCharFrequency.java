package freshPrograms2;

import java.util.HashMap;
import java.util.Map.Entry;

public class WordsAndCharFrequency {

    static void charFrequency(String str) {
    	String joinedString = str.replace(" ", "");
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	
    	for(int i= 0; i<joinedString.length(); i++) {
    		map.put(joinedString.charAt(i), map.getOrDefault(joinedString.charAt(i), 0)+1) ;    		
    	}
    	
    	for(Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println("Character: "+ entry.getKey() + ", frequency: " + entry.getValue());
			}
		}
    }
	
	static void wordFrequency(String str) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] splitedWords = str.split(" ");
		for(String str1: splitedWords) {
			map.put(str1, map.getOrDefault(str1, 0)+1);
		}

		for(Entry<String, Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println("Word: "+ entry.getKey() + ", frequency: " + entry.getValue());
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "This This This is is a test for char char frequency";
		wordFrequency(str);
		charFrequency(str);
	}
}
