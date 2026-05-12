package array.easy;

// Problem: Binary Search
// Platform: LeetCode
// Approach: Optimal Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};

        int target = 9;

        int left = 0;
        int right = nums.length - 1;

        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                ans = mid;
                break;
            }

            else if (nums[mid] < target) {

                left = mid + 1;
            }

            else {

                right = mid - 1;
            }
        }

        System.out.println("Index = " + ans);
    }
}
