package array.easy;

// Problem: Second Largest Element
// Platform: GeeksforGeeks
// Approach: Linear Scan (track max and second max)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > max){
                secondMax = max;
                max = num;
            } 
            else if(num > secondMax && num != max){
                secondMax = num;
            }
        }

        System.out.println("Second Largest = " + secondMax);
    }
}