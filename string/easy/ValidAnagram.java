package string.easy;

// Problem: Valid Anagram
// Platform: LeetCode
// Approach: Hashing (Frequency Array)
// Time Complexity: O(n)
// Space Complexity: O(1)  // (26 characters)

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true); 
    }
}