package array.easy;

// Problem: Search Insert Position
// Platform: LeetCode
// Approach: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class SearchInsertPosition {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};

        int target = 5;

        int left = 0;
        int right = nums.length - 1;

        int ans = nums.length;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] == target) {

                ans = mid;
                break;
            }

            else if (nums[mid] < target) {

                left = mid + 1;
            }

            else {

                ans = mid;
                right = mid - 1;
            }
        }

        System.out.println("Insert Position = " + ans);
    }
}
