package array.medium;

// Problem: Maximum Subarray Sum (Kadane’s)
// Platform: LeetCode
// Approach: Kadane’s Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSum =Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 1; i < arr.length; i++){
            currentSum+=arr[i];
            if(currentSum<0){
                currentSum=0;
            } 
            maxSum=Math.max(currentSum,maxSum);
        }
        System.out.println("Max Sum = " + maxSum);
    }
}