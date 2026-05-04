package string.hard;

// Problem: Longest Happy Prefix
// Platform: LeetCode
// Approach: Prefix Function (KMP)
// Time Complexity: O(n)
// Space Complexity: O(n)

public class LongestHappyPrefix {

    public static void main(String[] args) {

        String s = "level";

        int n = s.length();
        int[] lps = new int[n]; 
        int len = 0; 
        int i = 1;

        while (i < n) {

            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {

                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        int length = lps[n - 1];

        String result = s.substring(0, length);

        System.out.println(result); 
    }
}