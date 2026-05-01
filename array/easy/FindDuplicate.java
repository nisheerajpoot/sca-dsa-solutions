package array.easy;

// Problem: Find One Duplicate
// Platform: LeetCode
// Approach: Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(1)

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};

        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println("Duplicate = " + arr[i]);
                break;
            }
        }
    }
}