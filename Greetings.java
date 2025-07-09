import java.util.*;
public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.substring(0, 2) + input.substring(2, input.length() - 1).repeat(2) + input.charAt(input.length() - 1);
        System.out.println(output);
        scanner.close();
    }
}
