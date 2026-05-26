package array.easy;

public class WaterPlantsOnePerson {

    public static int wateringPlants(int[] plants, int capacity) {

        int steps = 0;
        int can = capacity;

        for (int i = 0; i < plants.length; i++) {

            if (can < plants[i]) {
                steps += 2 * i;
                can = capacity;
            }

            can -= plants[i];
            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {

        int[] plants = {2, 2, 3, 3};

        int capacity = 5;

        int result = wateringPlants(plants, capacity);

        System.out.println("Total Steps = " + result);
    }
}