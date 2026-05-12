package array.medium;

// Problem: Corporate Flight Bookings
// Platform: LeetCode 1109
// Approach: Difference Array + Prefix Sum
// Time Complexity: O(n + q)
// Space Complexity: O(n)

import java.util.Arrays;

public class CorporateFlightBookings {

    public static void main(String[] args) {

        int n = 5;

        int[][] bookings = {
            {1, 2, 10},
            {2, 3, 20},
            {2, 5, 25}
        };

        int[] diff = new int[n + 1];

        for (int[] b : bookings) {

            int first = b[0] - 1; 
            int last = b[1] - 1;
            int seats = b[2];

            diff[first] += seats;

            if (last + 1 < n) {
                diff[last + 1] -= seats;
            }
        }

        int[] result = new int[n];
        result[0] = diff[0];

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + diff[i];
        }

        System.out.println(Arrays.toString(result));
    }
}