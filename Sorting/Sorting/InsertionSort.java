package Sorting;

public class InsertionSort {
    public static void printarrays(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //iss wale method me element hamesha peeche compare karta hai ...<---(left side wale elements se compare karta hai)
    public static void main(String[] args) {
        int arr[]={2,5,6,1,8};
        // arr.length=5
        for(int i=1;i<arr.length;i++){ //hum index 1 se start karte hai , pehla element abhi chod do
            int current=arr[i]; // the value of arr[i] for i=1 is 5 , aur yeh hai 2nd element of array
            int j=i-1; //yeh hai pehla element
            while(j>=0 && current<arr[j]){ //agar 2nd element chota hua , tab tak usko array me peeche karo jab tak woh apni jagah par na ho
                arr[j+1]=arr[j];
                j--; //aur humare element ka index bhi toh ek peeche karna hai 
            }
            //yeh loop ke baad ek element sort ho gya hoga
            arr[j+1]=current; //abb comparing ke liye agle element pe chalte hai
        }
        printarrays(arr);
    }
    
}
