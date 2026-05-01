package array.easy;

// Problem: Single Number (Find element appearing once)
// Platform: LeetCode
// Approach: XOR
// Time Complexity: O(n)
// Space Complexity: O(1)

public class SingleNumber {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 4, 5, 3, 4};

        int result = 0;

        for (int num : arr) {
            result = result ^ num;
        }

        System.out.println("Single element = " + result);
    }
} 