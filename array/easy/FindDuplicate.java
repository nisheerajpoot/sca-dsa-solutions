package array.easy;

import java.util.Arrays;

public class FindDuplicate {

    public static int findDuplicate(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2, 2};

        int result = findDuplicate(arr);

        System.out.println("Duplicate = " + result);
    }
}