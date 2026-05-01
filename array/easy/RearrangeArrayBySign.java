package array.easy;

// Problem: Rearrange Array Elements by Sign
// Platform: LeetCode
// Approach: Extra Array (place +ve at even index, -ve at odd index)
// Time Complexity: O(n)
// Space Complexity: O(n)

public class RearrangeArrayBySign {

    public static void main(String[] args) {

        int[] arr = {3, 1, -2, -5, 2, -4};

        int n = arr.length;
        int[] result = new int[n];

        int pos = 0; 
        int neg = 1; 

        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                result[pos] = arr[i];
                pos += 2;
            } else {
                result[neg] = arr[i];
                neg += 2;
            }
        }

        for(int x : result){
            System.out.print(x + " ");
        }
    }
}
