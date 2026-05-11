package string.easy;

// Problem: Is Subsequence
// Platform: LeetCode
// Approach: Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

public class IsSubsequence {

    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        System.out.println(i == s.length()); 
    }
}