package array.medium;

// Problem: Find First and Last Position of Element
// Platform: LeetCode
// Approach: Lower Bound + Upper Bound Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class FindFirstAndLastPosition {

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};

        int target = 8;

        int first = -1;
        int last = -1;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                first = mid;

                right = mid - 1;
            }

            else if (nums[mid] < target) {

                left = mid + 1;
            }

            else {

                right = mid - 1;
            }
        }

        left = 0;
        right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                last = mid;

                left = mid + 1;
            }

            else if (nums[mid] < target) {

                left = mid + 1;
            }

            else {

                right = mid - 1;
            }
        }

        System.out.println("First Position = " + first);
        System.out.println("Last Position = " + last);
    }
}