package array.easy;
// Problem: Union of Two Sorted Arrays
// Platform: GeeksforGeeks
// Approach: Two Pointer (merge + avoid duplicates)
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)

public class UnionSortedArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};

        int n = arr1.length;
        int m = arr2.length;

        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (k == 0 || result[k - 1] != arr1[i]) {
                    result[k++] = arr1[i];
                }
                i++;
            } 
            else if (arr2[j] < arr1[i]) {
                if (k == 0 || result[k - 1] != arr2[j]) {
                    result[k++] = arr2[j];
                }
                j++;
            } 
            else {
                if (k == 0 || result[k - 1] != arr1[i]) {
                    result[k++] = arr1[i];
                }
                i++;
                j++;
            }
        }
        
        while (i < n) {
            if (k == 0 || result[k - 1] != arr1[i]) {
                result[k++] = arr1[i];
            }
            i++;
        }

        while (j < m) {
            if (k == 0 || result[k - 1] != arr2[j]) {
                result[k++] = arr2[j];
            }
            j++;
        }
        
        for (int x = 0; x < k; x++) {
            System.out.print(result[x] + " ");
        }
    }
}