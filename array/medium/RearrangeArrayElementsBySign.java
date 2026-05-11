package array.medium;

// Problem: Rearrange Array Elements by Sign
// Platform: LeetCode
// Approach: Two Pointer Placement
// Time Complexity: O(n)
// Space Complexity: O(n)

public class RearrangeArrayElementsBySign {

    public static void main(String[] args) {

        int[] nums = {3, 1, -2, -5, 2, -4};

        int n = nums.length;

        int[] result = new int[n];

        int posIndex = 0;
        int negIndex = 1;

        for (int i = 0; i < n; i++) {

            if (nums[i] > 0) {

                result[posIndex] = nums[i];

                posIndex += 2;
            }

            else {

                result[negIndex] = nums[i];

                negIndex += 2;
            }
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}