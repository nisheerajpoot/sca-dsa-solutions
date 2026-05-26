package string.easy;

public class RingsAndRods {

    public static int countPoints(String rings) {

        int[] rods = new int[10];

        for (int i = 0; i < rings.length(); i += 2) {

            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';

            if (color == 'R') {
                rods[rod] |= 1;
            }

            if (color == 'G') {
                rods[rod] |= 2;
            }

            if (color == 'B') {
                rods[rod] |= 4;
            }
        }

        int count = 0;

        for (int i = 0; i < 10; i++) {

            if (rods[i] == 7) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String rings = "B0R0G0R9R0B0G0";

        int result = countPoints(rings);

        System.out.println(result);
    }
}