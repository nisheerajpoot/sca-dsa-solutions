package string.medium;

public class MaxVowelsSubstring {

    public static int maxVowels(String s, int k) {

        int maxVowels = 0;
        int currentVowels = 0;

        for (int i = 0; i < k; i++) {

            if (isVowel(s.charAt(i))) {
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

            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
    }

    public static boolean isVowel(char ch) {

        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }

    public static void main(String[] args) {

        String s = "abciiiidef";

        int k = 5;

        int result = maxVowels(s, k);

        System.out.println(result);
    }
}