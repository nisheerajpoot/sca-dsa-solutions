package array.easy;

// Problem: Find Average of Array
// Platform: HackerRank
// Approach: Sum + Division
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};

        int sum = 0;

        for(int num : arr){
            sum += num;
        }

        double avg = (double) sum / arr.length;

        System.out.println("Average = " + avg);
    }
}