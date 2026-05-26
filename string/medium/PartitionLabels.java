package string.medium;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public static List<Integer> partitionLabels(String s) {

        int[] lastIndex = new int[26];

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        List<Integer> result = new ArrayList<>();

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            end = Math.max(end, lastIndex[s.charAt(i) - 'a']);

            if (i == end) {

                int length = end - start + 1;

                result.add(length);

                start = i + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "ababcbacadefegdehijhklij";

        List<Integer> result = partitionLabels(s);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}