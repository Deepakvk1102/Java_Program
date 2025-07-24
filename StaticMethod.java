
public class StaticMethod {
    
	 static String firstname = "Shiva";
//	 String lastname = "Prasad";
	 
	  void text() {
		 System.out.println("Hello world");
	 }
	public static void main(String[] args) {
		StaticMethod s = new StaticMethod();
		System.out.println(firstname);
//		System.out.println(s.lastname);
		s.text();
    
	}

}
