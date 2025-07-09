import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String order = sc.next();
        
        if (order.equals("ABC")) {
            System.out.println(a + " " + b + " " + c);
        } else if (order.equals("ACB")) {
            System.out.println(a + " " + c + " " + b);
        } else if (order.equals("BAC")) {
            System.out.println(b + " " + a + " " + c);
        } else if (order.equals("BCA")) {
            System.out.println(b + " " + c + " " + a);
        } else if (order.equals("CAB")) {
            System.out.println(c + " " + a + " " + b);
        } else if (order.equals("CBA")) {
            System.out.println(c + " " + b + " " + a);
        }
    }
}
