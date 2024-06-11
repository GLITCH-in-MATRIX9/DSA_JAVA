public class quicksort{
    public static int partition(int arr[], int low, int high){
        /*high is the last element of the arr */
        int pivot=arr[high];
        int i=low-1;
        for(int j=low ;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                /*for swapping we are using a temporary variable to store value of element at index 'i*/
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;  
    }
    public static void qsort(int arr[],int low,int high){
        if (low < high){
            //partition the array
            int pi= partition(arr,low,high);
            qsort(arr,low,pi-1);
            qsort(arr, pi+1, high);
        }
    }
    /*main code */      
    public static void main(String args[]){
        int arr[] = {5, 20, -14, 78,98};
        int n =arr.length;
        qsort(arr, 0, n-1);
        for(int i=0;i<n;i++){
             System.out.println(arr[i]+" ");

        }
        System.out.println();
    }
}