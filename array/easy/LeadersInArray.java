package array.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {

    public static List<Integer> findLeaders(int[] arr) {
        int n = arr.length;

        List<Integer> result = new ArrayList<>();
        int maxRight = arr[n - 1];

        result.add(maxRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                result.add(maxRight);
            }
        }

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        List<Integer> result = findLeaders(arr);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}