import java.util.*;

public class CoffeeCupCombo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String coffeeMachines = scanner.next();
        scanner.close();
        
        int coffeeStock = 0;
        int awakeLectures = 0;
        
        for (int i = 0; i < n; i++) {
            if (coffeeMachines.charAt(i) == '1') {
                coffeeStock = 2;
            }
            
            if (coffeeStock > 0) {
                awakeLectures++;
                coffeeStock--;
            }
        }
        
        System.out.println(awakeLectures);
    }
}