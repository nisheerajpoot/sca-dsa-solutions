package array.medium;

// Problem: Frequency of the Most Frequent Element
// Platform: LeetCode
// Approach: Sorting + Sliding Window
// Time Complexity: O(n log n)
// Space Complexity: O(1)

import java.util.Arrays;

public class FrequencyOfMostFrequentElement {

    public static void main(String[] args) {

        int[] nums = {1, 2, 4};

        int k = 5;

        Arrays.sort(nums);

        int left = 0;

        long sum = 0;

        int maxFrequency = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while ((long) nums[right] * (right - left + 1) - sum > k) {

                sum -= nums[left];

                left++;
            }

            maxFrequency = Math.max(maxFrequency, right - left + 1);
        }

        System.out.println("Maximum Frequency = " + maxFrequency);
    }
}
