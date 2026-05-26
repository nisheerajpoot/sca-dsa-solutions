package string.easy;

public class HalvesAlike {

    public static boolean halvesAreAlike(String s) {

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

        return leftCount == rightCount;
    }

    public static void main(String[] args) {

        String s = "book";

        boolean result = halvesAreAlike(s);

        System.out.println(result);
    }
}