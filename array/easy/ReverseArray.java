package array.easy;

// Problem: Reverse an Array
// Platform: LeetCode
// Approach: Two Pointer (swap start and end)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}