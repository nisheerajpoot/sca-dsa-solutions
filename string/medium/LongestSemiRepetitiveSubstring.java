package string.medium;

// Problem: Longest Semi-Repetitive Substring
// Platform: LeetCode
// Approach: Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LongestSemiRepetitiveSubstring {

    public static void main(String[] args) {

        String s = "52233";

        int left = 0;
        int pairCount = 0;
        int maxLength = 1;

        for (int right = 1; right < s.length(); right++) {

            if (s.charAt(right) == s.charAt(right - 1)) {
                pairCount++;
            }

            while (pairCount > 1) {

                if (s.charAt(left) == s.charAt(left + 1)) {
                    pairCount--;
                }

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength); 
    }
}