import java.util.Arrays;

public class Addone {
    public static int[] addonecheck(int[] arr){
       
        for(int i=arr.length-1;i>=0;i--){
            
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;


        }
        int[] result = new int[arr.length+ 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int[] result = addonecheck(arr);
        System.out.println(Arrays.toString(result)); // this was my learning 

    }

}
