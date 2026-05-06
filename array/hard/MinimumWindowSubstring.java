package array.hard;

// Problem: Minimum Window Substring
// Platform: LeetCode
// Approach: Sliding Window + HashMap
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MinimumWindowSubstring {

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        if (s.length() < t.length()) {
            System.out.println("");
            return;
        }

        int[] freq = new int[128];

        // store frequency of t
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i)]++;
        }

        int left = 0, right = 0;
        int count = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            // expand window
            if (freq[s.charAt(right)] > 0) {
                count--;
            }
            freq[s.charAt(right)]--;
            right++;

            // shrink window
            while (count == 0) {

                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                freq[s.charAt(left)]++;
                if (freq[s.charAt(left)] > 0) {
                    count++;
                }
                left++;
            }
        }

        // result
        if (minLen == Integer.MAX_VALUE) {
            System.out.println("");
        } else {
            System.out.println(s.substring(start, start + minLen));
        }
    }
}