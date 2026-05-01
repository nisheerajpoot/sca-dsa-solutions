package array.easy;

// Problem: Leaders in an Array
// Platform: GeeksforGeeks
// Approach: Traverse from Right
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LeadersInArray {

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        int n = arr.length;

        int maxRight = arr[n - 1];

        // last element always leader
        System.out.print(maxRight + " ");

        // traverse from right
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] > maxRight){
                maxRight = arr[i];
                System.out.print(maxRight + " ");
            }
        }
    }
}
