package array.easy;

// Problem: Check if Array is Sorted
// Platform: GeeksforGeeks
// Approach: Single Loop (compare adjacent elements)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        boolean isSorted = true;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Not Sorted");
        }
    }
}