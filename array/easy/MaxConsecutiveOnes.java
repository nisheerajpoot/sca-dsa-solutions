package array.easy;

public class MaxConsecutiveOnes {

    public static int findMaxOnes(int[] arr) {
        int count = 0;
        int max = 0;

        for (int num : arr) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 1, 1};

        int result = findMaxOnes(arr);

        System.out.println("Max 1s = " + result);
    }
}