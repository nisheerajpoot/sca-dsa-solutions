package array.medium;

// Problem: Single Element in a Sorted Array
// Platform: LeetCode
// Approach: Binary Search (Index Pairing)
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class SingleElementInSortedArray {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 3, 4, 4};

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        System.out.println(nums[left]);
    }
}