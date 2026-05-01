package array.easy;

// Problem: Find Missing Number
// Platform: LeetCode
// Approach: Sum Formula
// Time Complexity: O(n)
// Space Complexity: O(1)

public class FindMissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5}; 

        int n = 5; // total numbers (1 to n)

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for(int num : arr){
            actualSum += num;
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing number is: " + missing);
    }
}