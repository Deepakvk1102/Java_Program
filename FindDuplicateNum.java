import java.util.ArrayList;

public class FindDuplicateNum {
////INPROGRESS
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
       int[] a = {1, 2, 3, 3, 4, 5, 5, 6, 7, 1};
       int dupnu = duplicateNum(a);
       System.out.println("Your duplicate number is:"+ dupnu);
	}
      static int duplicateNum(int[] a) {
    	  int dupNum = 0;
    	  for(int i=0; i<=a.length/2; i++) {
    		  for(int j=1; j<=a.length/2; j++) {
    			  if(a[i]==a[j]) {
    				 dupNum = a[i];
    				 System.out.println(dupNum);
       			  }
    			  j++;
    		  }
    		  
    	  }
    	  return dupNum;
      }
}
