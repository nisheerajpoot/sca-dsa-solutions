package array.easy;

// Problem: Richest Customer Wealth
// Platform: LeetCode
// Approach: Row Sum + Max
// Time Complexity: O(n * m)
// Space Complexity: O(1)

public class RichestCustomerWealth {

    public static void main(String[] args) {

        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };

        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {

            int currentCustomerWealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                currentCustomerWealth += accounts[i][j];
            }

            if (currentCustomerWealth > maxWealth) {
                maxWealth = currentCustomerWealth;
            }
        }

        System.out.println("Richest Customer Wealth = " + maxWealth);
    }
}