package string.medium;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;
        }

        int windowSize = s1.length();

        for (int i = 0; i < s2.length(); i++) {

            arr2[s2.charAt(i) - 'a']++;

            if (i >= windowSize) {
                arr2[s2.charAt(i - windowSize) - 'a']--;
            }

            boolean same = true;

            for (int j = 0; j < 26; j++) {

                if (arr1[j] != arr2[j]) {
                    same = false;
                    break;
                }
            }

            if (same) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "ab";

        String s2 = "eidbaooo";

        boolean result = checkInclusion(s1, s2);

        System.out.println(result);
    }
}