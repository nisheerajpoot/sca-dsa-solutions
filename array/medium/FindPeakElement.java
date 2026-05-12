package array.medium;

// Problem: Find Peak Element
// Platform: LeetCode
// Approach: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class FindPeakElement {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        System.out.println(left); 
    }
}