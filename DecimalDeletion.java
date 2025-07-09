import java.util.Scanner;
public class DecimalDeletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        long roundedNumber = Math.round(number);
        System.out.println(roundedNumber);
        scanner.close();
    }
}
