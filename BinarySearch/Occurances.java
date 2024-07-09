package BinarySearch;

public class Occurances {
    public static int num_of_occurances(int[] arr, int target,int length){
        int left=0;
        int right=length-1;
        int count=0;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                count++;

            }else if(arr[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }

        }


        return count;
    }
    public static void main(String[] args) {
        int n = 7;
        int target = 13;
        int[] v = {3,4,13,13,13,20,40};
        int ans=num_of_occurances(v,target,n);
        System.out.println("The number of occurances are " + ans);
    }
    
}
