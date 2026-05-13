package array.easy;

public class MaximumPopulationYear {

    public static int maximumPopulation(int[][] logs) {

        int[] diff = new int[2051];

        for (int[] log : logs) {
            diff[log[0]]++;
            diff[log[1]]--;
        }

        int maxPop = 0;
        int year = 1950;
        int currentPop = 0;

        for (int i = 1950; i <= 2050; i++) {
            currentPop += diff[i];

            if (currentPop > maxPop) {
                maxPop = currentPop;
                year = i;
            }
        }

        return year;
    }

    public static void main(String[] args) {

        int[][] logs = {
            {1993, 1999},
            {2000, 2010},
            {1975, 2005},
            {1990, 2000}
        };

        int result = maximumPopulation(logs);

        System.out.println(result);
    }
}