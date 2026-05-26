package array.easy;

import java.util.Arrays;

public class TwoSum {

    public static int countPairs(int[] arr, int target) {

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;
        int count = 0;

        while (start < end) {

            int sum = arr[start] + arr[end];

            if (sum == target) {
                System.out.println("Pair: " + arr[start] + ", " + arr[end]);
                count++;
                start++;
                end--;
            }

            else if (sum > target) {
                end--;
            }

            else {
                start++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};

        int target = 10;

        int result = countPairs(arr, target);

        System.out.println("Total Pairs = " + result);
    }
}