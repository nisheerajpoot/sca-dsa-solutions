package array.easy;

// Problem: Sort 0, 1 and 2
// Platform: LeetCode
// Approach: Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)


public class SortZeroOneTwo {
    public static void main(String[] args) {

        int[] arr = {2, 0, 2, 1, 1, 0};

        int left = 0;      
        int curr = 0;      
        int right = arr.length - 1; 

        while (curr <= right) {

            if (arr[curr] == 0) {
                int temp = arr[left];
                arr[left] = arr[curr];
                arr[curr] = temp;

                left++;
                curr++;
            } 
            else if (arr[curr] == 2) {
                int temp = arr[curr];
                arr[curr] = arr[right];
                arr[right] = temp;

                right--;
            } 
            else {
                curr++;
            }
        }

       
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}