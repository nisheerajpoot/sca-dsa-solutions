package string.easy;

// Problem: Largest Odd Number in a String
// Platform: LeetCode
// Approach: Two Pointer (Right to Left Scan) 
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LargestOddNumber {

    public static void main(String[] args) {

        String num = "35427";
        String result = "";

        for (int i = num.length() - 1; i >= 0; i--) {

            int digit = num.charAt(i) - '0';

            if (digit % 2 != 0) {
               
                result = num.substring(0, i + 1);
                break;
            }
        }

        System.out.println(result);
    }
}