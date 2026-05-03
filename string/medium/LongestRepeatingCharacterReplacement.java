package string.medium;

// Problem: Longest Repeating Character Replacement
// Platform: LeetCode
// Approach: Sliding Window + Hashing
// Time Complexity: O(n)
// Space Complexity: O(1)  // (26 characters)

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;

        int[] freq = new int[26]; // store frequency of characters
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // increase frequency of current character
            freq[s.charAt(right) - 'A']++;

            // track max frequency in current window
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // window size - maxFreq > k → shrink window
            while ((right - left + 1) - maxFreq > k) {

                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength); // Output: 4
    }
}