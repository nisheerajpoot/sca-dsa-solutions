package array.easy;

public class SecondLargestElement {

    public static int findSecondLargest(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > max) {
                secondMax = max;
                max = num;
            }

            else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7};

        int result = findSecondLargest(arr);

        System.out.println("Second Largest = " + result);
    }
}