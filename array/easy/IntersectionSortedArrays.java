package array.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class IntersectionSortedArrays {

    public static int[] intersect(int[] arr1, int[] arr2) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        List<Integer> result = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            } 
            else if (arr1[i] < arr2[j]) {
                i++;
            } 
            else {
                j++;
            }
        }

        int[] ans = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            ans[k] = result.get(k);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr1 = {2, 4, 2, 5, 8, 9};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};

        int[] result = intersect(arr1, arr2);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}