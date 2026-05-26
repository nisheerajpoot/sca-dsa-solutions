package array.easy;

public class SingleNumber {

    public static int singleNumber(int[] arr) {

        int result = 0;

        for (int num : arr) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 4, 5, 3, 4};

        int result = singleNumber(arr);

        System.out.println("Single element = " + result);
    }
}