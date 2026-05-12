package string.medium;

// Problem: Move Pieces to Obtain a String
// Platform: LeetCode
// Approach: Two Pointer
// Pattern: Position Matching
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MovePiecesToObtainString {

    public static void main(String[] args) {

        String start = "_L__R__R_";
        String target = "L______RR";

        int i = 0;
        int j = 0;

        int n = start.length();

        while (i < n && j < n) {

            while (i < n && start.charAt(i) == '_') {
                i++;
            }

            while (j < n && target.charAt(j) == '_') {
                j++;
            }

            if (i == n && j == n) {
                System.out.println(true);
                return;
            }

            if (i == n || j == n) {
                System.out.println(false);
                return;
            }

            if (start.charAt(i) != target.charAt(j)) {
                System.out.println(false);
                return;
            }

            if (start.charAt(i) == 'L' && i < j) {
                System.out.println(false);
                return;
            }

            if (start.charAt(i) == 'R' && i > j) {
                System.out.println(false);
                return;
            }

            i++;
            j++;
        }

        System.out.println(true);
    }
}