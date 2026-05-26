package array.easy;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {

            int currentCustomerWealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                currentCustomerWealth += accounts[i][j];
            }

            maxWealth = Math.max(maxWealth, currentCustomerWealth);
        }

        return maxWealth;
    }

    public static void main(String[] args) {

        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };

        int result = maximumWealth(accounts);

        System.out.println("Richest Customer Wealth = " + result);
    }
}