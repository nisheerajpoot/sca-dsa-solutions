// Problem: Find Maximum Element
// Platform: GeeksforGeeks
// Approach: Linear Scan
// Time Complexity: O(n)
// Space Complexity: O(1)

package array.easy;
public class FindMaxElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Max = " + max);
    }
}