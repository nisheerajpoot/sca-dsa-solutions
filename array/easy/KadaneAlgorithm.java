package array.easy;

// Problem: Maximum Subarray Sum (Kadane’s)
// Platform: LeetCode
// Approach: Kadane’s Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSum = arr[0];
        int currentSum = arr[0];

        for(int i = 1; i < arr.length; i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Max Sum = " + maxSum);
    }
}