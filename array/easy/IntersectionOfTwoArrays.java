package array.easy;

// Problem: Intersection Of Two Arrays
// Platform: LeetCode
// Approach: Hashing
// Time Complexity: O(n + m)
// Space Complexity: O(n)

import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};

        int[] nums2 = {2, 2};

        HashSet<Integer> set = new HashSet<>();

        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {

            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {

            if (set.contains(nums2[i])) {

                result.add(nums2[i]);
            }
        }

        for (int x : result) {

            System.out.print(x + " ");
        }
    }
}
