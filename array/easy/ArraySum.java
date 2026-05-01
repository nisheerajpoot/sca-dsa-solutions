// Problem: Sum of Array
// Platform: HackerRank
// Approach: Accumulation (loop through array and add elements)
// Time Complexity: O(n)
// Space Complexity: O(1)

package array.easy;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }   
}
