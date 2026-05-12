package string.easy;

// Problem: Reverse Vowels of a String
// Platform: LeetCode
// Approach: Two Pointer
// Pattern: Opposite Direction Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ReverseVowels {

    public static void main(String[] args) {

        String s = "leetcode";

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (left < right &&
                  !isVowel(arr[left])) {

                left++;
            }

            while (left < right &&
                  !isVowel(arr[right])) {

                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(arr));
    }

    public static boolean isVowel(char ch) {

        ch = Character.toLowerCase(ch);

        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}
