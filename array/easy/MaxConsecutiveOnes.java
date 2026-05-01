package array.easy;

// Problem: Max Consecutive 1’s
// Platform: LeetCode
// Approach: Counting
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};

        int count = 0, max = 0;

        for(int num : arr){
            if(num == 1){
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println("Max 1s = " + max);
    }
}