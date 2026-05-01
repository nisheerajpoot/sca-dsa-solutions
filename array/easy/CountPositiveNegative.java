package array.easy;

// Problem: Count Positive & Negative Numbers
// Platform: GeeksforGeeks
// Approach: Counting
// Time Complexity: O(n)
// Space Complexity: O(1)

public class CountPositiveNegative {
    public static void main(String[] args) {
        int[] arr = {-2, 5, -1, 7, -3, 4};

        int positive = 0;
        int negative = 0;

        for(int num : arr){
            if(num >= 0){
                positive++;
            } else {
                negative++;
            }
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
    }
}
