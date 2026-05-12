package array.medium;

// Problem: Subarray Sums Divisible by K
// Platform: LeetCode
// Approach: Prefix Sum + HashMap (Modulo Frequency)
// Time Complexity: O(n)
// Space Complexity: O(k)

import java.util.HashMap;

public class SubarraySumsDivisibleByK {

    public static void main(String[] args) {

        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            sum += num;

            int mod = ((sum % k) + k) % k;

            if (map.containsKey(mod)) {
                count += map.get(mod);
            }

            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }

        System.out.println(count);
    }
}