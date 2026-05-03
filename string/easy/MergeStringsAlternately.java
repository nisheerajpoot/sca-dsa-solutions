package string.easy;

// Problem: Merge Strings Alternately
// Platform: LeetCode
// Approach: Two Pointer
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)

public class MergeStringsAlternately {

    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "pqr";
        String result = "";

        int i = 0, j = 0;

        while (i < word1.length() && j < word2.length()) {

            result += word1.charAt(i);
            i++;

            result += word2.charAt(j);
            j++;
        }

        while (i < word1.length()) {
            result += word1.charAt(i);
            i++;
        }

        while (j < word2.length()) {
            result += word2.charAt(j);
            j++;
        }

        System.out.println(result); 
    }
}