package string.medium;

// Problem: String to Integer (atoi)
// Platform: LeetCode
// Approach: Simulation (Parsing) + Edge Case Handling
// Time Complexity: O(n)
// Space Complexity: O(1)

public class StringToIntegerATOI {

    public static void main(String[] args) {

        String s = "   -42";

        int i = 0, n = s.length();
        int sign = 1;
        long result = 0;  // use long to handle overflow

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // 3. Convert digits
        while (i < n && Character.isDigit(s.charAt(i))) {

            result = result * 10 + (s.charAt(i) - '0');

            // 4. Handle overflow
            if (sign * result > Integer.MAX_VALUE) {
                System.out.println(Integer.MAX_VALUE);
                return;
            }

            if (sign * result < Integer.MIN_VALUE) {
                System.out.println(Integer.MIN_VALUE);
                return;
            }

            i++;
        }

        // 5. Print final result
        System.out.println((int)(sign * result)); // Output: -42
    }
}