package array.medium;

// Problem: Find Minimum in Rotated Sorted Array
// Platform: LeetCode
// Approach: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1; 
            } else {
                right = mid; 
            }
        }

        System.out.println(nums[left]);
    }
}