package array.medium;

// Problem: Partition Array According to Given Pivot
// Platform: LeetCode
// Approach: Two Pointer Partition
// Time Complexity: O(n)
// Space Complexity: O(n)

public class PartitionArrayAccordingToPivotTwoPointer {

    public static void main(String[] args) {

        int[] nums = {9, 12, 5, 10, 14, 3, 10};

        int pivot = 10;

        int n = nums.length;

        int[] result = new int[n];

        int left = 0;
        int right = n - 1;

        for (int i = 0; i < n; i++) {

            if (nums[i] < pivot) {
                result[left++] = nums[i];
            }

            if (nums[n - 1 - i] > pivot) {
                result[right--] = nums[n - 1 - i];
            }
        }

        while (left <= right) {
            result[left++] = pivot;
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
