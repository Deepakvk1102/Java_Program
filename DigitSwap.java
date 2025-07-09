import java.util.*;

public class DigitSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();
        scanner.close();
        
        String swappedCode = new StringBuilder(code).reverse().toString();
        System.out.println(swappedCode);
    }
}