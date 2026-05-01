package array.easy;

// Problem: Remove Duplicates (Sorted Array)
// Platform: LeetCode
// Approach: Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};

        int j = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }

        System.out.println("New Length = " + (j+1));
    }
}
