import java.util.ArrayList;

public class Move_zeroes {
    public static int[] MoveZeroes(int n,int arr[]){
        ArrayList<Integer> temp=new ArrayList<>();
        //add non-zero numbers to this array list
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }


        }
        //the size of the array list for non-zero numbers because for indexes after that we can simply add zero to them
        int nz=temp.size();
        for(int i=0;i<nz;i++){
            arr[i]=temp.get(i);

        }
        for(int i=nz;i<n;i++){
            arr[i]=0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr={1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int num=10;
        int ans[]=MoveZeroes(num,arr);
        for (int i = 0; i < num; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");


    }
    
}
