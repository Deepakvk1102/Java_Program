package freshPrograms2;

public class NumberOfWords {
     
	public static int numberOfWords(String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str = "This is to test number of words";
      int ans = numberOfWords(str);
      System.out.println("Number of words is:"+ ans);
	}

}
