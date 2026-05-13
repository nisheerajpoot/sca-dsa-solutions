package array.easy;

public class FindMaxElement {

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7};

        int result = findMax(arr);

        System.out.println("Max = " + result);
    }
}