package array.medium;

// Problem: Maximum Points You Can Obtain from Cards
// Platform: LeetCode
// Approach: Sliding Window
// Time Complexity: O(k)
// Space Complexity: O(1)

public class MaximumPointsFromCards {

    public static void main(String[] args) {

        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};

        int k = 3;

        int leftSum = 0;

        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }

        int maxSum = leftSum;

        int rightSum = 0;

        int rightIndex = cardPoints.length - 1;

        for (int i = k - 1; i >= 0; i--) {

            leftSum -= cardPoints[i];

            rightSum += cardPoints[rightIndex];

            rightIndex--;

            maxSum = Math.max(maxSum, leftSum + rightSum);
        }

        System.out.println("Maximum Points = " + maxSum);
    }
}