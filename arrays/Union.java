import java.util.ArrayList;
import java.util.HashSet;

public class Union {
    static ArrayList<Integer> FindUnion(int arr1[],int arr2[],int num1,int num2){
        HashSet <Integer> s=new HashSet<>();
        ArrayList <Integer> Union= new ArrayList<>();
        for(int i=0;i<num1;i++){
            s.add(arr1[i]);

        }
        for(int i=0;i<num2;i++){
            s.add(arr2[i]);

        }
        for(int it:s){
            Union.add(it);
        }
        return Union;
    

    }

    public static void main(String[] args) {
        int arr1[]={2,3,4,5};
        int arr2[]={1,2,3,4};
        int n=arr1.length;
        int m=arr2.length;
        ArrayList<Integer> Union=FindUnion(arr1,arr2,n,m) ; 
        for(int val:Union){
            System.out.print(val+" ");
        }  
    }
    
}
