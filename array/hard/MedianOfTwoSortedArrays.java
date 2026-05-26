package array.hard;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] A, int[] B) {

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

            int partitionA = left + (right - left) / 2;
            int partitionB = (m + n + 1) / 2 - partitionA;

            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : A[partitionA - 1];
            int minRightA = (partitionA == m) ? Integer.MAX_VALUE : A[partitionA];

            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : B[partitionB - 1];
            int minRightB = (partitionB == n) ? Integer.MAX_VALUE : B[partitionB];

            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {

                if ((m + n) % 2 == 0) {

                    int leftMax = Math.max(maxLeftA, maxLeftB);
                    int rightMin = Math.min(minRightA, minRightB);

                    return (leftMax + rightMin) / 2.0;
                }

                else {
                    return Math.max(maxLeftA, maxLeftB);
                }
            }

            if (maxLeftA > minRightB) {
                right = partitionA - 1;
            }

            else {
                left = partitionA + 1;
            }
        }

        return 0.0;
    }

    public static void main(String[] args) {

        int[] A = {1, 3};
        int[] B = {2, 4, 5, 6};

        double result = findMedianSortedArrays(A, B);

        System.out.println(result);
    }
}