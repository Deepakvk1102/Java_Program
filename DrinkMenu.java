import java.util.*;

public class DrinkMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int o = scanner.nextInt();
        scanner.nextLine();
        
        List<String> menu = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            menu.add(scanner.nextLine());
        }
        
        Map<String, Integer> customerOrderCount = new HashMap<>();
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < o; i++) {
            String customer = scanner.nextLine();
            int orderIndex = customerOrderCount.getOrDefault(customer, 0);
            result.add(menu.get(orderIndex));
            customerOrderCount.put(customer, orderIndex + 1);
        }
        
        scanner.close();
        
        for (String drink : result) {
            System.out.println(drink);
        }
    }
}