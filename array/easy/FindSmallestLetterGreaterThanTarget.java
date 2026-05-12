package array.easy;

// Problem: Find Smallest Letter Greater Than Target
// Platform: LeetCode
// Approach: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};

        char target = 'a';

        int left = 0;
        int right = letters.length - 1;

        char ans = letters[0];

        while (left <= right) {

            int mid = (left + right) / 2;

            if (letters[mid] > target) {

                ans = letters[mid];

                right = mid - 1;
            }

            else {

                left = mid + 1;
            }
        }

        System.out.println(ans);
    }
}