package Sliding_windows;

public class Nice_subarray {
    public static int numberOfSubarrays(int[] nums, int k){
        int totalsubarray=0;
        for(int i=0;i<nums.length;i++){
            int oddcount=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2!=0){
                    oddcount++; 
                }
                if(oddcount==k){
                    totalsubarray++;
                }

            }
        }

        return totalsubarray;

    }

    public static void main(String[] args) {
       
        
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        
        int result = numberOfSubarrays(nums, k);
        System.out.println("Number of nice subarrays: " + result); // Output: 2
    }

    
}
