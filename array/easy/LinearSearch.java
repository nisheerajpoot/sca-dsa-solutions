package array.easy;

// Problem: Linear Search
// Platform: HackerRank
// Approach: Linear Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int key = 5;

        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Element not found");
        }
    }
}