package array.medium;

// Problem: Interval List Intersections
// Platform: LeetCode
// Approach: Two Pointer
// Time Complexity: O(n + m)
// Space Complexity: O(1)

public class IntervalListIntersections {

    public static void main(String[] args) {

        int[][] firstList = {
            {0, 2},
            {5, 10},
            {13, 23},
            {24, 25}
        };

        int[][] secondList = {
            {1, 5},
            {8, 12},
            {15, 24},
            {25, 26}
        };

        int i = 0;
        int j = 0;

        while (i < firstList.length && j < secondList.length) {

            int start = Math.max(firstList[i][0], secondList[j][0]);

            int end = Math.min(firstList[i][1], secondList[j][1]);

            if (start <= end) {
                System.out.println("[" + start + ", " + end + "]");
            }

            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }
    }
}