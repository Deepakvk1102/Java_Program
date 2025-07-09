import java.util.*;
public class AlphabeticalAristocrats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> surnames = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            surnames.add(sc.nextLine());
        }
        Collections.sort(surnames, (s1, s2) -> {
            String part1 = s1.replaceFirst(".*[A-Z]", "");
            String part2 = s2.replaceFirst(".*[A-Z]", "");
            return part1.compareTo(part2);
        });
        for (String surname : surnames) {
            System.out.println(surname);
        }
    }
}
