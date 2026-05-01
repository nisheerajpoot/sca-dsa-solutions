package array.medium;

// Problem: Find Multiple Duplicates
// Platform: GeeksforGeeks
// Approach: Index Mapping
// Time Complexity: O(n)
// Space Complexity: O(1)

 

public class FindAllDuplicates { 
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,3,6,6};
        
        for(int i=0;i<arr.length;i++){
            int x=arr[i]%arr.length;
            arr[x]=arr[x]+arr.length;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]/arr.length>=2){
                System.out.println(i);
            }
        }
    }
}