package array.medium;

// Problem: Rotate Matrix by 90 Degrees
// Platform: LeetCode
// Approach: Transpose + Reverse (Optimal)
// Time Complexity: O(n^2)
// Space Complexity: O(1)

public class RotateMatrix90Optimal {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length;

        // Step 1: Transpose matrix
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){ 
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        
        for(int i = 0; i < n; i++){
            int left = 0, right = n - 1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

       
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}