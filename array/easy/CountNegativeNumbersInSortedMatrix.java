package array.easy;

public class CountNegativeNumbersInSortedMatrix {

    public static int countNegatives(int[][] grid) {
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
                } else {
                    left = mid + 1;
                }
            }

            count += grid[i].length - firstNegative;
        }

        return count;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };

        int result = countNegatives(grid);

        System.out.println("Negative Numbers = " + result);
    }
}