package array.medium;

// Problem: Water Plants II (2 People)
// Platform: LeetCode
// Approach: Two Pointer + Simulation
// Time Complexity: O(n)
// Space Complexity: O(1)

public class WaterPlantsTwoPeople {

    public static int minimumRefill(int[] plants, int capacityA, int capacityB) {

        int i = 0;
        int j = plants.length - 1;

        int canA = capacityA;
        int canB = capacityB;

        int refillA = 0;
        int refillB = 0;

        while (i < j) {
            
            if (canA < plants[i]) {
                refillA++;
                canA = capacityA;
            }
            canA -= plants[i];
            i++;
            
            if (canB < plants[j]) {
                refillB++;
                canB = capacityB;
            }
            canB -= plants[j];
            j--;
        }

        if (i == j) {
            if (Math.max(canA, canB) < plants[i]) {
                refillA++; 
            }
        }

        return refillA + refillB;
    }

    public static void main(String[] args) {

        int[] plants = {2, 2, 3, 3};
        int capacityA = 5;
        int capacityB = 5;

        int result = minimumRefill(plants, capacityA, capacityB);

        System.out.println("Minimum Refills = " + result);
    }
}