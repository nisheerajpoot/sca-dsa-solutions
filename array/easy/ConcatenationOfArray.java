package array.easy;

// Problem: Concatenation of Array
// Platform: LeetCode
// Approach: Simple Traversal
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ConcatenationOfArray {

    public static void main(String[] args) {

        int[] nums = {1, 2, 1};

        int n = nums.length;
        int[] ans = new int[2 * n];

        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        // print result
        for(int x : ans){
            System.out.print(x + " ");
        }
    }
}