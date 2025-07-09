import java.util.*;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x1 = s.nextDouble(), y1 = s.nextDouble(), x2 = s.nextDouble(), y2 = s.nextDouble();
        double area = Math.abs((x2 - x1) * (y2 - y1));
        System.out.printf("%.3f\n", area);
        s.close();
    }
}
