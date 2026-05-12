package array.medium;

// Problem: 4Sum II
// Platform: LeetCode
// Approach: HashMap (Pair Sum + Hashing)
// Time Complexity: O(n^2)
// Space Complexity: O(n^2)

import java.util.HashMap;

public class FourSumII {

    public static void main(String[] args) {

        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int a : nums1) {
            for (int b : nums2) {

                int sum = a + b;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int count = 0;

      
        for (int c : nums3) {
            for (int d : nums4) {

                int target = -(c + d);

                if (map.containsKey(target)) {
                    count += map.get(target);
                }
            }
        }

        System.out.println(count);
    }
}