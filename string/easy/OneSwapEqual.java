package string.easy;

// Problem: Check if Two Strings are Equal After One Swap
// Platform: LeetCode
// Approach: Two Pointer / Mismatch Tracking
// Time Complexity: O(n)
// Space Complexity: O(1)

public class OneSwapEqual {

    public static void main(String[] args) {

        String s1 = "bank";
        String s2 = "kanb";

        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        int first = -1, second = -1;

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {

                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    System.out.println(false);
                    return;
                }
            }
        }

        if (first == -1) {
            System.out.println(true);
            return;
        }

        if (second != -1 &&
            s1.charAt(first) == s2.charAt(second) &&
            s1.charAt(second) == s2.charAt(first)) {

            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
