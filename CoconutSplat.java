import java.util.*;

public class CoconutSplat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        
        List<Integer> hands = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            hands.add(i);
            hands.add(i);
        }
        
        int index = 0;
        while (hands.size() > 1) {
            index = (index + s - 1) % hands.size();
            if (Collections.frequency(hands, hands.get(index)) == 2) {
                hands.add(index, hands.get(index));
            } else {
                hands.remove(index);
            }
        }
        
        System.out.println(hands.get(0));
    }
}