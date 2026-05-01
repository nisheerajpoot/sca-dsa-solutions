package array.easy;

// Problem: Container With Most Water
// Platform: LeetCode
// Approach: Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] height = {1, 5, 4, 3};

        int i = 0;
        int j = height.length - 1;

        int area = 0;

        while (i < j) {

            int h = Math.min(height[i], height[j]);
            int width = j - i;
            int calArea = h * width;

            if (calArea > area) {
                area = calArea;
            }

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println(area);
    }
}