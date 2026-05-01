package array.easy;

// Problem: Intersection of Sorted Arrays
// Platform: GeeksforGeeks
// Approach: Two Pointer
// Time Complexity: O(n+m)
// Space Complexity: O(1)

public class IntersectionSortedArrays {
    public static void main(String[] args) {
        int []arr1={2,4,2,5,8,9};
        int []arr2={1,2,3,4,5,6,7};
        int k=0;
        int n=arr1.length;
        int m=arr2.length;
        int []result=new int[n+m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j]){
                    result[k++]=arr1[i];
                }
            }
        }
        
     for(int i=0;i<k;i++){
         System.out.print(result[i]);
     }
    }
}
