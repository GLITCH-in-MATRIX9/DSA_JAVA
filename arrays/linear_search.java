
import java.util.Scanner;

public class linear_search{


    
    public static int linearSearch(int n, int num, int []arr){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }


        


        return -1;//if no number is found
        
    }

   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("enter number of characters");
        int a=sc.nextInt();
        int [] arr= new int[a];
        System.out.println("enter the elements of array");
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("which number are u looking for in the array");
        int num=sc.nextInt();
        int index=linearSearch(a, num, arr);

        if (index!=-1){
            System.out.println("the number "+num+"is at index "+index);
        }else{
            System.out.println("number not found");
        }



        sc.close();
   }
   

}