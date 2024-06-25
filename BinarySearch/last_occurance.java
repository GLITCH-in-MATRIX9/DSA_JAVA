package BinarySearch;

public class last_occurance {
    public static int solve(int n,int k,int[] arr){
        int index=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==k){
                index=i;
                break;
                
                
            }
        }
        return index;

        
    }
    
    public static void main(String[] args) {
        
        int n = 7;
    int key = 13;
    int[] v = {3,4,13,13,13,20,40};

    // returning the last occurrence index if the element is present otherwise -1
    System.out.println(solve(n, key, v));
    }
    
}
