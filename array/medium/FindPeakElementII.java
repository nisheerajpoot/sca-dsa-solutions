package array.medium;

// Problem: Find Peak Element II
// Platform: LeetCode
// Approach: Binary Search on Columns
// Time Complexity: O(m log n)
// Space Complexity: O(1)

public class FindPeakElementII {

    public static void main(String[] args) {

        int[][] mat = {
            {10, 20, 15},
            {21, 30, 14},
            {7, 16, 32}
        };

        int m = mat.length;
        int n = mat[0].length;

        int left = 0;
        int right = n - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int maxRow = 0;

            for (int i = 1; i < m; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            int leftVal = (mid - 1 >= 0) ? mat[maxRow][mid - 1] : -1;
            int rightVal = (mid + 1 < n) ? mat[maxRow][mid + 1] : -1;

            if (mat[maxRow][mid] > leftVal && mat[maxRow][mid] > rightVal) {
                System.out.println(maxRow + " " + mid);
                return;
            }

            if (rightVal > mat[maxRow][mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}