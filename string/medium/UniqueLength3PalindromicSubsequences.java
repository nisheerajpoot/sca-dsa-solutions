package string.medium;

import java.util.HashSet;

public class UniqueLength3PalindromicSubsequences {

    public static int countPalindromicSubsequence(String s) {

        int count = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {

            int first = s.indexOf(ch);
            int last = s.lastIndexOf(ch);

            if (first != -1 && last - first >= 2) {

                HashSet<Character> set = new HashSet<>();

                for (int i = first + 1; i < last; i++) {
                    set.add(s.charAt(i));
                }

                count += set.size();
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "aabca";

        int result = countPalindromicSubsequence(s);

        System.out.println(result);
    }
}