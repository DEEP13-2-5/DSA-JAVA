import java.util.*;

public class Share {
    public static int share(int price[]) {
        int buy = Integer.MAX_VALUE; // Initialize buy to the largest possible integer
        int maxProfit = 0; // Initialize maxProfit to 0

        for (int i = 0; i < price.length; i++) {
            if (price[i] < buy) {
                buy = price[i]; // Update buy to the current price if it's lower
            } else {
                int profit = price[i] - buy; // Calculate profit
                maxProfit = Math.max(maxProfit, profit); // Update maxProfit if the current profit is greater
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] price = {7, 1, 5, 3, 6, 4};
        int result = share(price);
        System.out.println("Maximum Profit: " + result); // Print the result
    }
}
