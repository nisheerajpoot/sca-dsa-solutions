package array.medium;

// Problem: Majority Element
// Platform: LeetCode
// Approach: Moore’s Voting Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MajorityElement {

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        int count = 0;
        int candidate = 0;

        
       for(int i=0;i<arr.length;i++){
        if(count== 0){
            candidate = arr[i];  
        }
         if (arr[i]== candidate) {
                count++;
            } else {
                count--;
            }
       }

        int freq = 0;
        for (int num : arr) {
            if (num == candidate) {
                freq++;
            }
        }

        if (freq > arr.length / 2) {
            System.out.println("Majority Element = " + candidate);
        } else {
            System.out.println("No Majority Element");
        }
    }
}