package string.easy;

// Problem: Long Pressed Name
// Platform: LeetCode
// Approach: Two Pointer
// Pattern: Sequential Matching
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LongPressedName {

    public static void main(String[] args) {

        String name = "alex";
        String typed = "aaleex";

        int i = 0;
        int j = 0;

        while (j < typed.length()) {

            if (i < name.length() &&
                name.charAt(i) == typed.charAt(j)) {

                i++;
                j++;
            }

            else if (j > 0 &&
                     typed.charAt(j) == typed.charAt(j - 1)) {

                j++;
            }

            else {
                System.out.println(false);
                return;
            }
        }

        System.out.println(i == name.length());
    }
}
