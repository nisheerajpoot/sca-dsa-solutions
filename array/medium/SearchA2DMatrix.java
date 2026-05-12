package array.medium;

// Problem: Search a 2D Matrix
// Platform: LeetCode
// Approach: Binary Search on virtual 1D array
// Time Complexity: O(log(m*n))
// Space Complexity: O(1)

public class SearchA2DMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 3;

        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = (m * n) - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int row = mid / n;
            int col = mid % n;

            int value = matrix[row][col];

            if (value == target) {
                System.out.println(true);
                return;
            }

            if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(false);
    }
}