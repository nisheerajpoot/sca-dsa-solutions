package array.easy;

public class CountEvenOdd {

    public static int[] countEvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return new int[]{even, odd};
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] result = countEvenOdd(arr);

        System.out.println("Even = " + result[0]);
        System.out.println("Odd = " + result[1]);
    }
}