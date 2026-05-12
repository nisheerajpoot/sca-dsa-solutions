package array.medium;

// Problem: Range Addition
// Platform: LeetCode 370
// Approach: Difference Array + Prefix Sum
// Time Complexity: O(n + q)
// Space Complexity: O(n)

import java.util.Arrays;

public class RangeAddition {

    public static void main(String[] args) {

        int length = 5;

        int[][] updates = {
            {1, 3, 2},
            {2, 4, 3},
            {0, 2, -2}
        };

        int[] diff = new int[length];

        for (int[] update : updates) {

            int start = update[0];
            int end = update[1];
            int val = update[2];

            diff[start] += val;

            if (end + 1 < length) {
                diff[end + 1] -= val;
            }
        }

        int[] result = new int[length];
        result[0] = diff[0];

        for (int i = 1; i < length; i++) {
            result[i] = result[i - 1] + diff[i];
        }

        System.out.println(Arrays.toString(result));
    }
}