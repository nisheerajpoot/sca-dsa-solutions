package string.easy;

// Problem: Isomorphic Strings
// Platform: LeetCode
// Approach: Hashing (Character Mapping)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class IsomorphicString {

    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        char[] map1 = new char[256]; 
        char[] map2 = new char[256]; 

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map1[c1] == 0 && map2[c2] == 0) {
                map1[c1] = c2;
                map2[c2] = c1;
            }
         
            else {
                if (map1[c1] != c2 || map2[c2] != c1) {
                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(true); 
    }
}