package array.easy;

// Problem: Valid Perfect Square
// Platform: LeetCode
// Approach: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class ValidPerfectSquare {

    public static void main(String[] args) {

        int num = 16;

        int left = 1;
        int right = num;

        boolean isPerfectSquare = false;

        while (left <= right) {

            int mid = (left + right) / 2;

            long square = (long) mid * mid;

            if (square == num) {

                isPerfectSquare = true;
                break;
            }

            else if (square < num) {

                left = mid + 1;
            }

            else {

                right = mid - 1;
            }
        }

        System.out.println(isPerfectSquare);
    }
}