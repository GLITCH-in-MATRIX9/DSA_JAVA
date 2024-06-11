import java.util.*;
public class Remove_Duplicates {
    static int removeduplicates(int arr[]){
        HashSet <Integer> set= new HashSet<>();  //we are using hashset as it does not allow duplicates automatically
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        int k=set.size();
        int j=0;
        for(int x:set){
            arr[j++]=x;
        }
        return k;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int k=removeduplicates(arr);
        System.out.println("the array after removing duplicates is ");
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    
}
