package array.medium;

// Problem: Bag of Tokens
// Platform: LeetCode
// Approach: Sorting + Greedy Two Pointer
// Time Complexity: O(n log n)
// Space Complexity: O(1)

import java.util.Arrays;

public class BagOfTokens {

    public static void main(String[] args) {
        int [] tokens={100,200,300,400};
        int power = 200;

        Arrays.sort(tokens);

        int left = 0;
        int right = tokens.length - 1;

        int score = 0;
        int maxScore = 0;

        while (left <= right) {

            if (power >= tokens[left]) {

                power -= tokens[left];
                score++;

                maxScore = Math.max(maxScore, score);

                left++;
            }

            else if (score > 0) {

                power += tokens[right];
                score--;

                right--;
            }

            else {
                break;
            }
        }

        System.out.println("Maximum Score = " + maxScore);
    }
}
   