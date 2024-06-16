package PRACTICE;

public class bubble_sort {
    public static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"      ");

        }

    }
    public static void main(String[] args) {
        int [] arr={1,6,4,73,26,90};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){      //because the array will run till only the few indexes left after it
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }

            }
        }
        printarray(arr);
    }
    
    
}
