package BinarySearch;

public class Recursive_BinarySearch {
    public static int search_number(int []arr, int low, int high , int x){
        if(low>high){
            
            return -1;
        }

        int mid=(low+high)/2;
        if(arr[mid]==x){
            return mid;
        }else if(arr[mid]>x){
            return search_number(arr, low, mid-1, x);
        }else{
            return search_number(arr, mid+1, high, x);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int search = 9;
        int left = 0;
        int right = arr.length - 1;
        int ans = search_number(arr, left, right, search);
        System.out.println("The number is at index " + ans);
    }

}
