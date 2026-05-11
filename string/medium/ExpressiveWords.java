package string.medium;

// Problem: Expressive Words
// Platform: LeetCode
// Approach: Two Pointer
// Time Complexity: O(n * m)
// Space Complexity: O(1)

public class ExpressiveWords {

    public static void main(String[] args) {

        String s = "heeellooo";

        String[] words = {"hello", "hi", "helo"};

        int count = 0;

        for (String word : words) {

            int i = 0;
            int j = 0;

            boolean valid = true;

            while (i < s.length() && j < word.length()) {

                if (s.charAt(i) != word.charAt(j)) {
                    valid = false;
                    break;
                }

                int count1 = 0;

                while (i < s.length() &&
                       s.charAt(i) == s.charAt(i == 0 ? 0 : i - 1)) {

                    count1++;
                    i++;
                }

                int count2 = 0;

                while (j < word.length() &&
                       word.charAt(j) == word.charAt(j == 0 ? 0 : j - 1)) {

                    count2++;
                    j++;
                }

                // invalid cases
                if (count1 < count2) {
                    valid = false;
                    break;
                }

                if (count1 > count2 && count1 < 3) {
                    valid = false;
                    break;
                }
            }

            if (i != s.length() || j != word.length()) {
                valid = false;
            }

            if (valid) {
                count++;
            }
        }

        System.out.println(count); 
    }
}