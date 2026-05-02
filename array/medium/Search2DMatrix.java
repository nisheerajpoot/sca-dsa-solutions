package array.medium;

// Problem: Search in a 2D Matrix
// Platform: LeetCode
// Approach: Binary Search (treat matrix as 1D)
// Time Complexity: O(log(n*m))
// Space Complexity: O(1)

public class Search2DMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 3;

        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = n * m - 1;

        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target) {
                found = true;
                break;
            } 
            else if (matrix[row][col] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        System.out.println(found);
    }
}