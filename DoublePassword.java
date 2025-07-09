import java.util.*;

public class DoublePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password1 = scanner.next();
        String password2 = scanner.next();
        scanner.close();
        
        int combinations = 1;
        for (int i = 0; i < 4; i++) {
            if (password1.charAt(i) != password2.charAt(i)) {
                combinations *= 2;
            }
        }
        
        System.out.println(combinations);
    }
}
