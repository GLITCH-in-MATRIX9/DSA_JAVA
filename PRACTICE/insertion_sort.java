package PRACTICE;

public class insertion_sort {
    public static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"      ");

        }

    }
    public static void main(String[] args) {
        int [] arr={1,40,6,9,34};
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            if(j>0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        printarray(arr);
    }
    
    
}
