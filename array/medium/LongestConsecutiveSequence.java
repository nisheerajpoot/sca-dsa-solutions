package array.medium;
// Problem: Longest Consecutive Sequence
// Platform: LeetCode
// Approach: Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(1)

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        int n = nums.length;

        if (n == 0) {
            System.out.println("Longest consecutive sequence: 0");
            return;
        }

        Arrays.sort(nums);

        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        for (int i = 0; i < n; i++) {

            if (nums[i] - 1 == lastSmaller) {
                cnt++;
                lastSmaller = nums[i];
            } 
            else if (nums[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = nums[i];
            }

            longest = Math.max(longest, cnt);
        }

        System.out.println("Longest consecutive sequence: " + longest);
    }
} 