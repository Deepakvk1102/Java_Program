import java.util.*;

public class CandyStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine();
        Map<String, List<String>> initialsMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String fullName = scanner.nextLine().trim();
            String[] nameParts = fullName.split(" ");
            String initials = nameParts[0].substring(0, 1) + nameParts[1].substring(0, 1);
            initialsMap.computeIfAbsent(initials, k -> new ArrayList<>()).add(fullName);
        }
        for (int i = 0; i < q; i++) {
            String query = scanner.nextLine().trim();
            List<String> names = initialsMap.get(query);
            if (names == null) {
                System.out.println("nobody");
            } else if (names.size() == 1) {
                System.out.println(names.get(0));
            } else {
                System.out.println("ambiguous");
            }
        }
        scanner.close();
    }
}
