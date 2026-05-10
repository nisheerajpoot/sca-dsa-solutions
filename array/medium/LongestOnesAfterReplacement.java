package array.medium;

// Problem: Longest Ones After Replacement
// Platform: LeetCode
// Approach: Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LongestOnesAfterReplacement {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};

        int k = 2;

        int left = 0;

        int zeroCount = 0;

        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {

                if (nums[left] == 0) {
                    zeroCount--;
                }

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Longest Ones Length = " + maxLength);
    }
}
