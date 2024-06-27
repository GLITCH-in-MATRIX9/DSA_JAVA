package BinarySearch;
//to find minimum value we use Integer.MAX_VALUE and to find max value we use Integer.MIN_VALUE

public class Min_rotated {
    public static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        int min=Integer.MAX_VALUE;
        while (low<=high) {
            int mid=(low+high)/2;
            min = Math.min(min, nums[mid]);
            if(nums[low]<nums[mid]){
                min=Math.min(min, nums[low]);
                low=mid+1;

            }
            else{
            

                
                high = mid - 1;
            }
            
        }

        return min;

        
    } 

    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
        
        int min=findMin(nums);
        System.out.println("The minimum is the number "+ min);

    }
    
}
