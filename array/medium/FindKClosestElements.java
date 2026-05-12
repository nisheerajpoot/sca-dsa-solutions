package array.medium;

// Problem: Find K Closest Elements
// Platform: LeetCode
// Approach: Binary Search on window
// Time Complexity: O(log n + k)
// Space Complexity: O(1) excluding result

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;

        int left = 0;
        int right = arr.length - k;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }

        System.out.println(result);
    }
}