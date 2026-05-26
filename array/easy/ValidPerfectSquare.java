package array.easy;

public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {

        int left = 1;
        int right = num;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            long square = (long) mid * mid;

            if (square == num) {
                return true;
            }

            else if (square < num) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int num = 16;

        boolean result = isPerfectSquare(num);

        System.out.println(result);
    }
}