package Sorting;

public class InsertionSort {
    public static void printarrays(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[]={2,5,6,1,8};
        // arr.length=5
        for(int i=1;i<arr.length;i++){
            int current=arr[i]; // the value of arr[i] for i=1 is 5
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        printarrays(arr);
    }
    
}
