package array.easy;

// Problem: Running Sum of 1D Array
// Platform: LeetCode
// Approach: Prefix Sum
// Time Complexity: O(n)
// Space Complexity: O(1) 

public class RunningSum {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i - 1];
        }

        for(int x : nums){
            System.out.print(x + " ");
        }
    }
}