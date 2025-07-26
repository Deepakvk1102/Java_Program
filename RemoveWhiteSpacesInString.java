package freshPrograms2;

public class RemoveWhiteSpacesInString {
	
	
	static String whiteSpaceRemoved(String str) {
        
		StringBuilder s = new StringBuilder();
		for(int i =0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c != ' ') {
				s.append(c);
			}
		}		

		return s.toString();
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = " Remove white spaces in string ";
//     System.out.println(str.replace(" ", ""));
     String ans = whiteSpaceRemoved(str);
     System.out.println(ans);
     
	}

}
