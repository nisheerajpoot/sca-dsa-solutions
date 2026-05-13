package array.easy;

public class CountPositiveNegative {

    public static int[] countPosNeg(int[] arr) {
        int positive = 0;
        int negative = 0;

        for (int num : arr) {
            if (num >= 0) {
                positive++;
            } else {
                negative++;
            }
        }

        return new int[]{positive, negative};
    }

    public static void main(String[] args) {

        int[] arr = {-2, 5, -1, 7, -3, 4};

        int[] result = countPosNeg(arr);

        System.out.println("Positive = " + result[0]);
        System.out.println("Negative = " + result[1]);
    }
}