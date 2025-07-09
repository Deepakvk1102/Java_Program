import java.util.*;

public class BottleOpening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        
        if (k == 0) {
            System.out.println("impossible");
            return;
        }
        
        if (n == 1 || k > n - 1) {
            System.out.println("impossible");
            return;
        }
        
        for (int i = 1; i <= k; i++) {
            System.out.println("open " + i + " using " + (i + 1));
        }
    }
}
