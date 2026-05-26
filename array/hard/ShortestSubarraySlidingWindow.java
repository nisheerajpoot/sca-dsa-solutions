package array.hard;

public class ShortestSubarraySlidingWindow {

    public static int shortestSubarray(int[] nums, int k) {

        int left = 0;
        int sum = 0;

        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum >= k) {

                minLength = Math.min(minLength, right - left + 1);

                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};

        int k = 7;

        int result = shortestSubarray(nums, k);

        System.out.println(result);
    }
}