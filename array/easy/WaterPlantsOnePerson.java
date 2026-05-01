package array.easy;

// Problem: Water Plants (1 Person)
// Platform: LeetCode
// Approach: Simulation
// Time Complexity: O(n)
// Space Complexity: O(1)

public class WaterPlantsOnePerson {

    public static int wateringPlants(int[] plants, int capacity) {

        int steps = 0;
        int i = 0;
        int can = capacity;

        while (i < plants.length) {

            // agar paani sufficient hai
            if (can >= plants[i]) {
                can = can - plants[i];
                steps++;   // move to next plant
                i++;
            } 
            else {
                // refill ke liye wapas jaana + aana
                steps += (2 * i);  
                can = capacity;
            }
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