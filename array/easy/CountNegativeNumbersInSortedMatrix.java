package array.easy;

// Problem: Count Negative Numbers in a Sorted Matrix
// Platform: LeetCode
// Approach: Matrix Binary Search
// Time Complexity: O(m log n)
// Space Complexity: O(1)

public class CountNegativeNumbersInSortedMatrix {

    public static void main(String[] args) {

        int[][] grid = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };

        int count = 0;

        for (int i = 0; i < grid.length; i++) {

            int left = 0;
            int right = grid[i].length - 1;

            int firstNegative = grid[i].length;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (grid[i][mid] < 0) {

                    firstNegative = mid;

                    right = mid - 1;
                }

                else {

                    left = mid + 1;
                }
            }

            count += grid[i].length - firstNegative;
        }

        System.out.println("Negative Numbers = " + count);
    }
}