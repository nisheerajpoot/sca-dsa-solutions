package array.easy;

// Problem: Sort 0 and 1
// Platform: GeeksforGeeks
// Approach: Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)



public class SortZeroOne {
    public static void main(String[] args) {

        int[] arr = {0,1,1,0,1,0,0,1};

        int left = 0;
        int right = arr.length - 1;
        int temp=0;

        while(left < right){                
           if(arr[left]==1){
            if(arr[right]!=1){
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            right--;
           }else
            left++;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}