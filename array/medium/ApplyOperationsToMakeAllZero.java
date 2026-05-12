package array.medium;

// Problem: Apply Operations to Make All Array Elements Equal to Zero
// Platform: LeetCode
// Approach: Difference Array + Prefix Sum
// Time Complexity: O(n + q)
// Space Complexity: O(n)

public class ApplyOperationsToMakeAllZero {

    public static void main(String[] args) {

        int[] nums = {1, 2, 1};

        int[][] queries = {
            {0, 2},
            {0, 2},
            {0, 2}
        };

        int n = nums.length;
        int[] diff = new int[n + 1];

        for (int[] q : queries) {

            int l = q[0];
            int r = q[1];

            diff[l] -= 1;

            if (r + 1 < n) {
                diff[r + 1] += 1;
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += diff[i];

            int finalValue = nums[i] + sum;

            if (finalValue != 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}