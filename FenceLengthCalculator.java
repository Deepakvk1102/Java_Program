import java.util.Scanner;

public class FenceLengthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = scanner.nextDouble();
        double sideLength = Math.sqrt(area);
        double perimeter = 4 * sideLength;
        System.out.println(perimeter);
        scanner.close();
    }
}
