package string.easy;

// Problem: Check If String Halves Are Alike
// Platform: LeetCode
// Approach: Two Pointer / Counting
// Time Complexity: O(n)
// Space Complexity: O(1)

public class HalvesAlike {

    public static void main(String[] args) {

        String s = "book";

        int leftCount = 0;
        int rightCount = 0;

        int n = s.length();

        for (int i = 0; i < n / 2; i++) {

            char ch1 = Character.toLowerCase(s.charAt(i));
            if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
                leftCount++;
            }

            char ch2 = Character.toLowerCase(s.charAt(i + n / 2));
            if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u') {
                rightCount++;
            }
        }

        System.out.println(leftCount == rightCount); // Output: true
    }
}
