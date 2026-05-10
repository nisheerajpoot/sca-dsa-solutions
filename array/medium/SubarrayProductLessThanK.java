package array.medium;

// Problem: Subarray Product Less Than K
// Platform: LeetCode
// Approach: Sliding Window / Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

public class SubarrayProductLessThanK {

    public static void main(String[] args) {

        int[] nums = {10, 5, 2, 6};
        int k = 100;

        if (k <= 1) {
            System.out.println(0);
            return;
        }

        int left = 0;
        int product = 1;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            product *= nums[right];

            while (product >= k) {

                product /= nums[left];

                left++;
            }

            count += (right - left + 1);
        }

        System.out.println("Total Subarrays = " + count);
    }
}