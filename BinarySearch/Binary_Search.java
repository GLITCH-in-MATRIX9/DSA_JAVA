package BinarySearch;

// Binary search is only applicable in a sorted search space. The sorted search space does not necessarily have to be a sorted array. It can be anything but the search space must be sorted.
public class Binary_Search {
    public static int search_number(int [] arr,int num) {
        int left=0;
        int right=arr.length-1;
        
        while (left<=right) {
            int mid=left+(right-left)/2;
            if(arr[mid]==num){
                return mid;
            }else if(num>arr[mid]){
                left=mid+1;
                

            }else{
                right=mid-1;
            }
            
        }
        

        return -1;
        
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7,8,9,10,11,12};
        int search=9;
        int ans=search_number(arr,search);
        System.out.println("The number is at index "+ans);

    }

    
}
