import java.util.*;
public class NoThanks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Set<Integer> cards = new HashSet<>();
        for (int i = 0; i < n; i++) {
            cards.add(s.nextInt());
        }
        List<Integer> sortedCards = new ArrayList<>(cards);
        Collections.sort(sortedCards);
        int score = sortedCards.get(0);
        for (int i = 1; i < sortedCards.size(); i++) {
            if (sortedCards.get(i) != sortedCards.get(i - 1) + 1) {
                score += sortedCards.get(i);
            }
        }
        System.out.println(score);
        s.close();
    }
}
