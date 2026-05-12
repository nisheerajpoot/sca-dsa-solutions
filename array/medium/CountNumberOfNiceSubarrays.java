package array.medium;

// Problem: Count Number of Nice Subarrays
// Platform: LeetCode
// Approach: Sliding Window (At Most K Odds)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class CountNumberOfNiceSubarrays {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;

        System.out.println(atMost(nums, k) - atMost(nums, k - 1));
    }

    static int atMost(int[] nums, int k) {

        int left = 0;
        int count = 0;
        int result = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] % 2 != 0) {
                k--;
            }

            while (k < 0) {

                if (nums[left] % 2 != 0) {
                    k++;
                }

                left++;
            }

            result += (right - left + 1);
        }

        return result;
    }
}