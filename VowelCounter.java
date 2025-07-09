import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
        scanner.close();
    }
}
