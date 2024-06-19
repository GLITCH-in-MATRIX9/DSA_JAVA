import java.util.Arrays;

public class maxsum {
    public static int maxSubarraySum(int[] arr, int n) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[j];
                max=Math.max(sum, max);
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int [] arr={1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
    
}
