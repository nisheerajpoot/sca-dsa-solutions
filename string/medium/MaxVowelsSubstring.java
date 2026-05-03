package string.medium;

// Problem: Maximum Number of Vowels in a Substring of Given Length K
// Platform: LeetCode
// Approach: Sliding Window (Fixed Size)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaxVowelsSubstring {

    public static void main(String[] args) {

        String s = "abciiiidef";
        int k = 5;

        int maxVowels = 0;
        int currentVowels = 0;

        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                currentVowels++;
            }
        }

        maxVowels = currentVowels;

        for (int i = k; i < s.length(); i++) {

            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }

            if (isVowel(s.charAt(i - k))) {
                currentVowels--;
            }

            if (currentVowels > maxVowels) {
                maxVowels = currentVowels;
            }
        }

        System.out.println(maxVowels); 
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }
}