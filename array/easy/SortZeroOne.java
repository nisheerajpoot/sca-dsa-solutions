package array.easy;

public class SortZeroOne {

    public static void sortZeroOne(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] == 1) {

                if (arr[right] != 1) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }

                right--;
            }

            else {
                left++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};

        sortZeroOne(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}