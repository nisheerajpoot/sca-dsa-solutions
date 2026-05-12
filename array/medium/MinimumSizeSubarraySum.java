package array.medium;

// Problem: Minimum Size Subarray Sum
// Platform: LeetCode
// Approach: Sliding Window (Two Pointer)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MinimumSizeSubarraySum {

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum >= target) {

                minLen = Math.min(minLen, right - left + 1);

                sum -= nums[left];
                left++;
            }
        }

        System.out.println(minLen == Integer.MAX_VALUE ? 0 : minLen);
    }
}