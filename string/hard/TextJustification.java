package string.hard;

// Problem: Text Justification
// Platform: LeetCode
// Approach: Greedy + Simulation
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

public class TextJustification {

    public static void main(String[] args) {

        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < words.length) {

            int j = i;
            int lineLength = 0;

            // Step 1: find how many words fit in one line
            while (j < words.length && lineLength + words[j].length() + (j - i) <= maxWidth) {
                lineLength += words[j].length();
                j++;
            }

            int gaps = j - i - 1;
            String line = "";

            // Step 2: last line OR single word → left justified
            if (j == words.length || gaps == 0) {

                for (int k = i; k < j; k++) {
                    line += words[k];
                    if (k < j - 1) line += " ";
                }

                // fill remaining spaces
                while (line.length() < maxWidth) {
                    line += " ";
                }
            }

            // Step 3: fully justified
            else {

                int totalSpaces = maxWidth - lineLength;
                int spaceEach = totalSpaces / gaps;
                int extra = totalSpaces % gaps;

                for (int k = i; k < j; k++) {

                    line += words[k];

                    if (k < j - 1) {

                        for (int s = 0; s < spaceEach; s++) {
                            line += " ";
                        }

                        if (extra > 0) {
                            line += " ";
                            extra--;
                        }
                    }
                }
            }

            result.add(line);
            i = j;
        }

        // print result
        for (String str : result) {
            System.out.println("\"" + str + "\"");
        }
    }
}