package array.hard;

// Problem: Find in Mountain Array
// Platform: LeetCode
// Approach: Binary Search (Peak + Two Searches)
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class FindInMountainArray {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 4, 2};
        int target = 4;

        int peak = findPeak(arr);

        int leftResult = binarySearchAsc(arr, 0, peak, target);

        if (leftResult != -1) {
            System.out.println(leftResult);
            return;
        }

        int rightResult = binarySearchDesc(arr, peak + 1, arr.length - 1, target);

        System.out.println(rightResult);
    }

    static int findPeak(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    static int binarySearchAsc(int[] arr, int l, int r, int target) {

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid] < target) l = mid + 1;
            else r = mid - 1;
        }

        return -1;
    }

    static int binarySearchDesc(int[] arr, int l, int r, int target) {

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid] > target) l = mid + 1;
            else r = mid - 1;
        }

        return -1;
    }
}