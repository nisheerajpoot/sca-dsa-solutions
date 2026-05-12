package array.hard;

// Problem: Minimum Moves to Make Array Complementary
// Platform: LeetCode
// Approach: Difference Array + Range Contribution
// Time Complexity: O(n + limit)
// Space Complexity: O(limit)

public class MinMovesToMakeArrayComplementary {

    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 3};
        int limit = 4;

        int n = nums.length;

        int[] diff = new int[2 * limit + 2];

        for (int i = 0; i < n / 2; i++) {

            int a = nums[i];
            int b = nums[n - i - 1];

            int min = Math.min(a, b);
            int max = Math.max(a, b);

            diff[2] += 2;
            diff[2 * limit + 1] -= 2;

            diff[min + 1] -= 1;
            diff[a + b] -= 1;
            diff[a + b + 1] += 1;
            diff[max + limit + 1] += 1;
        }

        int ans = Integer.MAX_VALUE;
        int curr = 0;

        for (int i = 2; i <= 2 * limit; i++) {

            curr += diff[i];

            ans = Math.min(ans, curr);
        }

        System.out.println(ans);
    }
}