package array.easy;

// Problem: Find All Numbers Disappeared in an Array
// Platform: LeetCode
// Approach: In-place Hashing (Index Marking)
// Time Complexity: O(n)
// Space Complexity: O(1) extra space (excluding output)

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int index = Math.abs(nums[i]) - 1;

            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}