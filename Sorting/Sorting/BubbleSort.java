package Sorting;

public class BubbleSort {

    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
// yaha se code start karte hai
//basic info jaan lo bubble sort ke baare me, yeh biklul bubble ki tarah elements ko jump karake bhejega
    public static void main(String[] args) {
        int arr[]={7,8,1,2,3,10}; //yeh array hai
        for(int i=0;i<arr.length-1;i++){ // we'll go till minus one the length of array kyunki last wala already sort ho gya hoga end tak
             for(int j=0;j<arr.length-i-1;j++){ // hum sirf uske aage ke bache hue elements tak karenge matlab pehla element agar 
                //dekh rhe hai toh uske aage 4 aur element honge na compare karne ke liye .....isliye  
                if(arr[j]>arr[j+1]){ //one number ahead is compared 
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }//yeh loop ke baad pehla \sabse bada element- 10, apni jagah par hoga and 8 bhi ..loop ke hisaab se kyunki 10 already apni jagah par hai
             }
        }
        
        PrintArray(arr);
    }
    
}
