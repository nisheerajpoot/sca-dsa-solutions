package array.medium;

// Problem: Continuous Subarray Sum
// Platform: LeetCode
// Approach: Prefix Sum + HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;

public class ContinuousSubarraySum {

    public static void main(String[] args) {

        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int sum = 0;
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            int rem = sum % k;

            if (map.containsKey(rem)) {

                int prevIndex = map.get(rem);

                if (i - prevIndex >= 2) {
                    found = true;
                    break;
                }

            } else {
                map.put(rem, i);
            }
        }

        System.out.println(found);
    }
}