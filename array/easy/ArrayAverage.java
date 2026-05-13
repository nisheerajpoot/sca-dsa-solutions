package array.easy;

public class ArrayAverage {

    public static double findAverage(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8};

        double avg = findAverage(arr);

        System.out.println("Average = " + avg);
    }
}