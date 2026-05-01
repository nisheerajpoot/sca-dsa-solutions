// Problem: Find Minimum Element
// Platform: GeeksforGeeks
// Approach: Linear Scan
// Time Complexity: O(n)
// Space Complexity: O(1)

package array.easy;
public class FindMinElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Min = " + min);
    }
}