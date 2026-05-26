package array.medium;

public class ApplyOperationsToMakeAllZero {

    public static boolean isZeroArray(int[] nums, int[][] queries) {

        int n = nums.length;

        int[] diff = new int[n + 1];

        for (int[] q : queries) {

            int left = q[0];
            int right = q[1];

            diff[left] -= 1;

            if (right + 1 < n) {
                diff[right + 1] += 1;
            }
        }

        int prefixSum = 0;

        for (int i = 0; i < n; i++) {

            prefixSum += diff[i];

            int finalValue = nums[i] + prefixSum;

            if (finalValue != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1};

        int[][] queries = {
                {0, 2},
                {0, 2},
                {0, 2}
        };

        boolean result = isZeroArray(nums, queries);

        System.out.println(result);
    }
}