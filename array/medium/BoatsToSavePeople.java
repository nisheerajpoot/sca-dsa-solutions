package array.medium;

// Problem: Boats to Save People
// Platform: LeetCode
// Approach: Two Pointer + Greedy
// Time Complexity: O(n log n)  // sorting
// Space Complexity: O(1)

import java.util.Arrays;

public class BoatsToSavePeople {

    public static void main(String[] args) {

        int[] people = {3, 2, 2, 1};
        int limit = 3;

        Arrays.sort(people); 

        int left = 0;
        int right = people.length - 1;

        int boats = 0;

        while (left <= right) {

            if (people[left] + people[right] <= limit) {
                left++;
            }

            right--;
            boats++;
        }

        System.out.println(boats); 
    }
}