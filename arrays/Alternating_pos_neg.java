import java.util.ArrayList;

public class Alternating_pos_neg {
    public static int[] RearrangebySign(int [] arr, int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                ArrayList<Integer> negative =new ArrayList<>();
                negative.add(arr[i]);

            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int A[]= {1,2,-4,-5};
      
      
        int[]ans= RearrangebySign(A,n);
        
        for (int i = 0; i < n; i++) {
          System.out.print(ans[i]+" ");
        }
      
      }
    }
    
}
