import java.util.*;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int g1 = scanner.nextInt(), g2 = scanner.nextInt(), g3 = scanner.nextInt(), g4 = scanner.nextInt();
        int e1 = scanner.nextInt(), e2 = scanner.nextInt(), e3 = scanner.nextInt(), e4 = scanner.nextInt();
        scanner.close();
        
        double gunnarSum = getAverageSum(g1, g2, g3, g4);
        double emmaSum = getAverageSum(e1, e2, e3, e4);
        
        if (gunnarSum > emmaSum) {
            System.out.println("Gunnar");
        } else if (emmaSum > gunnarSum) {
            System.out.println("Emma");
        } else {
            System.out.println("Tie");
        }
    }
    
    private static double getAverageSum(int a, int b, int c, int d) {
        return ((a + b) / 2.0) + ((c + d) / 2.0);
    }
}
