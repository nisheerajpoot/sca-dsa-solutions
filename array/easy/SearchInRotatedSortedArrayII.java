package array.easy;

// Problem: Search in Rotated Sorted Array II
// Platform: LeetCode
// Approach: Modified Binary Search
// Time Complexity: O(log n) average
// Space Complexity: O(1)

public class SearchInRotatedSortedArrayII {

    public static void main(String[] args) {

        int[] nums = {2,5,6,0,0,1,2};

        int target = 0;

        int left = 0;
        int right = nums.length - 1;

        boolean found = false;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                found = true;
                break;
            }

            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {

                left++;
                right--;
            }

            else if (nums[left] <= nums[mid]) {

                if (target >= nums[left] && target < nums[mid]) {

                    right = mid - 1;
                }

                else {

                    left = mid + 1;
                }
            }

            else {

                if (target > nums[mid] && target <= nums[right]) {

                    left = mid + 1;
                }

                else {

                    right = mid - 1;
                }
            }
        }

        System.out.println(found);
    }
}