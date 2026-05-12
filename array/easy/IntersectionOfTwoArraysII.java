package array.easy;

// Problem: Intersection of Two Arrays II
// Platform: LeetCode
// Approach: HashMap Hashing
// Time Complexity: O(n + m)
// Space Complexity: O(n)

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArraysII {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};

        int[] nums2 = {2, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {

            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {

            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {

                result.add(nums2[i]);

                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        for (int x : result) {

            System.out.print(x + " ");
        }
    }
}