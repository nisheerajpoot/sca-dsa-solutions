package array.easy;

// Problem: Two Sum (Pair Count)
// Platform: Custom / Based on Two Pointer Approach
// Approach: Two Pointer (works only for sorted array)
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};
        int target = 10;

    
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;
        int count = 0;

        while (start < end) {
            int sum = arr[start] + arr[end];

            if (sum == target) {
                count++;
                System.out.println("Pair: " + arr[start] + ", " + arr[end]);
                start++;
                end--;
            } 
            else if (sum > target) {
                end--;
            } 
            else {
                start++;
            }
        }

        System.out.println("Total Pairs = " + count);
    }
}