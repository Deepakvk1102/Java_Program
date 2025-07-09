import java.util.*;
public class SortOfSorting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int n = s.nextInt();
            if (n == 0) break;
            s.nextLine();
            List<String> names = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                names.add(s.nextLine());
            }
            names.sort((a, b) -> a.substring(0, 2).compareTo(b.substring(0, 2)));
            for (String name : names) {
                System.out.println(name);
            }
            System.out.println();
        }
        s.close();
    }
}
