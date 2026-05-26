package string.medium;

public class ShiftingLetters {

    public static String shiftingLetters(String s, int[] shifts) {

        int n = s.length();

        for (int i = n - 2; i >= 0; i--) {
            shifts[i] = shifts[i] + shifts[i + 1];
        }

        char[] result = new char[n];

        for (int i = 0; i < n; i++) {

            int move = shifts[i] % 26;

            char ch = (char) ((s.charAt(i) - 'a' + move) % 26 + 'a');

            result[i] = ch;
        }

        return new String(result);
    }

    public static void main(String[] args) {

        String s = "abc";

        int[] shifts = {3, 5, 9};

        String result = shiftingLetters(s, shifts);

        System.out.println(result);
    }
}