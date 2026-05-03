package string.medium;

// Problem: Group Anagrams
// Platform: LeetCode
// Approach: Hashing + Sorting
// Time Complexity: O(n * k log k)  // n = number of strings, k = max length
// Space Complexity: O(n * k)

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] arr = word.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        for (List<String> group : map.values()) {
            System.out.println(group);
        }

       
    }
}