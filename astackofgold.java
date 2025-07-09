import java.util.Scanner;

public class AStackOfGold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int weight = sc.nextInt();
        int n = sc.nextInt();
        
        int tungstenWeight = 1000;  // weight of one tungsten coin in mg
        int totalCoins = n * (n + 1) / 2;  // total number of coins weighed
        
        int difference = weight - (tungstenWeight * totalCoins);  // difference due to gold coins
        int stack = difference / (1000);  // calculate which stack contains the gold coins
        
        System.out.println(stack);
    }
}
