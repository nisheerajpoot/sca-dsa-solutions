package array.hard;

// Problem: Shortest Subarray with Sum at Least K
// Approach: Sliding Window
// Condition: Works only for positive numbers
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ShortestSubarraySlidingWindow {

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        int k = 7;

        int left = 0;
        int sum = 0;

        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum >= k) {

                minLength = Math.min(minLength,
                                     right - left + 1);

                sum -= nums[left];
                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLength);
        }
    }
}
