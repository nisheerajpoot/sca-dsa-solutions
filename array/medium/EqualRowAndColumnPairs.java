package array.medium;

// Problem: Equal Row and Column Pairs
// Platform: LeetCode
// Approach: HashMap Hashing (Row Encoding)
// Time Complexity: O(n^2)
// Space Complexity: O(n^2)

import java.util.HashMap;

public class EqualRowAndColumnPairs {

    public static void main(String[] args) {

        int[][] grid = {
            {3, 2, 1},
            {1, 7, 6},
            {2, 7, 7}
        };

        HashMap<String, Integer> map = new HashMap<>();

        int n = grid.length;

        for (int i = 0; i < n; i++) {

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]).append(",");
            }

            String row = sb.toString();
            map.put(row, map.getOrDefault(row, 0) + 1);
        }

        int count = 0;

        for (int j = 0; j < n; j++) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                sb.append(grid[i][j]).append(",");
            }

            String col = sb.toString();

            if (map.containsKey(col)) {
                count += map.get(col);
            }
        }

        System.out.println(count);
    }
}