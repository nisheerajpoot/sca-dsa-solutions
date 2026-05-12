package array.easy;

// Problem: Contains Duplicate
// Platform: LeetCode
// Approach: Hashing
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        HashSet<Integer> set = new HashSet<>();

        boolean found = false;

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {

                found = true;
                break;
            }

            set.add(nums[i]);
        }

        System.out.println(found);
    }
}
