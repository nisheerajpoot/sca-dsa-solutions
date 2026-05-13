package array.easy;

public class FindMissingNumber {

    public static int missingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};

        int n = 5;

        int result = missingNumber(arr, n);

        System.out.println("Missing number is: " + result);
    }
}