package array.medium;

// Problem: Find Multiple Duplicates
// Platform: GeeksforGeeks
// Approach: Hashing
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashSet;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,3,6,6};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int num : arr){
            if(!set.add(num)){
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
}