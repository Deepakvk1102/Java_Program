package freshPrograms2;

public class PyramidNumPattern {
  
	
	///////Still It is pending need to complete

	static void pyramidPattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=i; j<n-i; j++) {				
				System.out.print(" ");
			}
			for(int k=i; k<n; k++) {
				System.out.print(k + " ");
			}
			for(int j=i; j<n-i; j++) {				
				System.out.print(" ");
			}		
             System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		pyramidPattern(n);
	}

}
