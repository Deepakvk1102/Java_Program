public class MissingNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 3, 5, 6, 7};
		for (int i=1; i<=a.length-1; i++) {
				if(a[i-1]!=i) {
				int missingnum = i;
				System.out.println("Missing number:"+ missingnum);
				break;
			}
		}
}
}