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

        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            freq[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxFreq > k) {

                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength); 
    }
}