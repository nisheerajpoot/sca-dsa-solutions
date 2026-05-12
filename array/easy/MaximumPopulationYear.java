package array.easy;

// Problem: Maximum Population Year
// Platform: LeetCode
// Approach: Difference Array + Prefix Sum
// Time Complexity: O(n + R)
// Space Complexity: O(R)

public class MaximumPopulationYear {

    public static void main(String[] args) {

        int[][] logs = {
            {1993, 1999},
            {2000, 2010},
            {1975, 2005},
            {1990, 2000}
        };

        int[] diff = new int[2051];

        for (int[] log : logs) {

            int birth = log[0];
            int death = log[1];

            diff[birth] += 1;
            diff[death] -= 1;
        }

        int maxPop = 0;
        int year = 1950;
        int currentPop = 0;

        for (int i = 1950; i <= 2050; i++) {

            currentPop += diff[i];

            if (currentPop > maxPop) {
                maxPop = currentPop;
                year = i;
            }
        }

        System.out.println(year);
    }
}