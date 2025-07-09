import java.util.*;

public class BreakingBranches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        if (n % 2 == 0) {
            System.out.println("Alice");
            System.out.println(n / 2);
        } else {
            System.out.println("Bob");
        }
    }
}
