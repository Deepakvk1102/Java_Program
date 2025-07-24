public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a = 10;
       int b = 20;
       
       swap(a, b);
       
       
	}
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a+ " " + b);
	}
}
