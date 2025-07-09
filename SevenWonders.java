import java.util.*;
public class SevenWonders {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int t = 0, c = 0, g = 0;
        for (char ch : input.toCharArray()) {
            if (ch == 'T') t++;
            else if (ch == 'C') c++;
            else if (ch == 'G') g++;
        }
        int points = t * t + c * c + g * g + Math.min(t, Math.min(c, g)) * 7;
        System.out.println(points);
        s.close();
    }
}
