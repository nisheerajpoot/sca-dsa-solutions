package array.medium;


// Problem: Top K Frequent Elements
// Platform: LeetCode
// Approach: HashMap + Bucket Sort (Hashing)
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int key : map.keySet()) {

            int freq = map.get(key);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = bucket.length - 1; i >= 0 && result.size() < k; i--) {

            if (bucket[i] != null) {

                for (int val : bucket[i]) {
                    result.add(val);
                    if (result.size() == k) break;
                }
            }
        }

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}