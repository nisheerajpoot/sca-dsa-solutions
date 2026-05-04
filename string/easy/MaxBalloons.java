package string.easy;

// Problem: Maximum Number of Balloons
// Platform: LeetCode
// Approach: Hashing (Frequency Count)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaxBalloons {

    public static void main(String[] args) {

        String text = "loonbalxballpoon";

        int[] freq = new int[26];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i) - 'a']++;
        }

        int b = freq['b' - 'a'];
        int a = freq['a' - 'a'];
        int l = freq['l' - 'a'] / 2; 
        int o = freq['o' - 'a'] / 2; 
        int n = freq['n' - 'a'];

        int result = Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);

        System.out.println(result); 
    }
}