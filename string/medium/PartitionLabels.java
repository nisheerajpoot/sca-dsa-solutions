package string.medium;

// Problem: Partition Labels
// Platform: LeetCode
// Approach: Greedy + Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

public class PartitionLabels {

    public static void main(String[] args) {

        String s = "ababcbacadefegdehijhklij";

        int[] lastIndex = new int[26];

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            end = Math.max(end, lastIndex[s.charAt(i) - 'a']);

            if (i == end) {

                int length = end - start + 1;

                System.out.print(length + " ");

                start = i + 1;
            }
        }

       
    }
}
