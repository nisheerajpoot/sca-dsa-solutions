package array.easy;

public class ArraySum {

    public static int findSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int sum = findSum(arr);

        System.out.println("Sum = " + sum);
    }
}