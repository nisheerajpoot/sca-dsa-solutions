package string.medium;

// Problem: Unique Length-3 Palindromic Subsequences
// Platform: LeetCode
// Approach: Hashing + First/Last Occurrence
// Time Complexity: O(26 * n)
// Space Complexity: O(1)

import java.util.HashSet;

public class UniqueLength3PalindromicSubsequences {

    public static void main(String[] args) {

        String s = "aabca";

        int count = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {

            int first = s.indexOf(ch);
            int last = s.lastIndexOf(ch);

            if (first != -1 && last - first >= 2) {

                HashSet<Character> set = new HashSet<>();

                for (int i = first + 1; i < last; i++) {
                    set.add(s.charAt(i));
                }

                count += set.size();
            }
        }

        System.out.println(count);
    }
}