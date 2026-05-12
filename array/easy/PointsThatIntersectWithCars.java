package array.easy;

// Problem: Points That Intersect With Cars
// Platform: LeetCode
// Approach: Difference Array + Prefix Sum
// Time Complexity: O(n + R)
// Space Complexity: O(R)

public class PointsThatIntersectWithCars {

    public static void main(String[] args) {

        int[][] cars = {
            {1, 4},
            {2, 5},
            {7, 9}
        };

        int[] diff = new int[101];

        for (int[] car : cars) {

            int start = car[0];
            int end = car[1];

            diff[start] += 1;

            if (end + 1 < diff.length) {
                diff[end + 1] -= 1;
            }
        }

        int count = 0;
        int coverage = 0;

        for (int i = 0; i < diff.length; i++) {

            coverage += diff[i];

            if (coverage > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}