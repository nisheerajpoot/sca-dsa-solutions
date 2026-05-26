package string.medium;

public class ExpressiveWords {

    public static int expressiveWords(String s, String[] words) {

        int count = 0;

        for (String word : words) {

            if (isStretchy(s, word)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isStretchy(String s, String word) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < word.length()) {

            if (s.charAt(i) != word.charAt(j)) {
                return false;
            }

            char ch = s.charAt(i);

            int count1 = 0;

            while (i < s.length() && s.charAt(i) == ch) {
                count1++;
                i++;
            }

            int count2 = 0;

            while (j < word.length() && word.charAt(j) == ch) {
                count2++;
                j++;
            }

            if (count1 < count2) {
                return false;
            }

            if (count1 > count2 && count1 < 3) {
                return false;
            }
        }

        return i == s.length() && j == word.length();
    }

    public static void main(String[] args) {

        String s = "heeellooo";

        String[] words = {"hello", "hi", "helo"};

        int result = expressiveWords(s, words);

        System.out.println(result);
    }
}