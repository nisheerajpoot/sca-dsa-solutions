package array.medium;

// Problem: Number of Sub-arrays With Odd Sum
// Platform: LeetCode
// Approach: Prefix Sum + Odd/Even Count
// Time Complexity: O(n)
// Space Complexity: O(1)

public class NumberOfSubarraysWithOddSum {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5};

        int mod = 1000000007;

        int prefixSum = 0;

        int oddCount = 0;
        int evenCount = 1;

        int result = 0;

        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];

            if (prefixSum % 2 != 0) {

                result = (result + evenCount) % mod;

                oddCount++;
            }

            else {

                result = (result + oddCount) % mod;

                evenCount++;
            }
        }

        System.out.println("Number of Odd Sum Subarrays = " + result);
    }
}
