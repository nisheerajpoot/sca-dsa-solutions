package array.hard;

// Problem: Median of Two Sorted Arrays
// Platform: LeetCode
// Approach: Binary Search on Partition
// Time Complexity: O(log(min(m,n)))
// Space Complexity: O(1)

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {

        int[] A = {1, 3};
        int[] B = {2, 4, 5, 6};

        if (A.length > B.length) {
            int[] temp = A;
            A = B;
            B = temp;
        }

        int m = A.length;
        int n = B.length;

        int left = 0;
        int right = m;

        while (left <= right) {

            int partitionA = (left + right) / 2;
            int partitionB = (m + n + 1) / 2 - partitionA;

            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : A[partitionA - 1];
            int minRightA = (partitionA == m) ? Integer.MAX_VALUE : A[partitionA];

            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : B[partitionB - 1];
            int minRightB = (partitionB == n) ? Integer.MAX_VALUE : B[partitionB];

            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {

                if ((m + n) % 2 == 0) {
                    int leftMax = Math.max(maxLeftA, maxLeftB);
                    int rightMin = Math.min(minRightA, minRightB);
                    System.out.println((leftMax + rightMin) / 2.0);
                } else {
                    System.out.println(Math.max(maxLeftA, maxLeftB));
                }

                return;
            }

            if (maxLeftA > minRightB) {
                right = partitionA - 1;
            } else {
                left = partitionA + 1;
            }
        }
    }
}