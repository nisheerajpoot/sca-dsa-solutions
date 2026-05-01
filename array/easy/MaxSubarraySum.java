package array.easy;

// Problem: Maximum Subarray Sum (Brute Force)
// Platform: GeeksforGeeks
// Approach: Nested Loop (check all subarrays)
// Time Complexity: O(n^2)
// Space Complexity: O(1)

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            int currentSum = 0;

            for(int j = i; j < arr.length; j++){
                currentSum += arr[j];
                maxSum = Math.max(maxSum, currentSum);
            } 
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}