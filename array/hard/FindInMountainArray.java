package array.hard;

public class FindInMountainArray {

    public static int findInMountainArray(int[] arr, int target) {

        int peak = findPeak(arr);

        int leftResult = binarySearchAsc(arr, 0, peak, target);

        if (leftResult != -1) {
            return leftResult;
        }

        return binarySearchDesc(arr, peak + 1, arr.length - 1, target);
    }

    public static int findPeak(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } 
            else {
                right = mid;
            }
        }

        return left;
    }

    public static int binarySearchAsc(int[] arr, int left, int right, int target) {

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int binarySearchDesc(int[] arr, int left, int right, int target) {

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 4, 2};

        int target = 4;

        int result = findInMountainArray(arr, target);

        System.out.println(result);
    }
}