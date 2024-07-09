package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class Single_element {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        int n=arr.size();
        if(n==1){
            return arr.get(0);
        }
        return -1;

        
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr =
            new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6));
        int ans = singleNonDuplicate(arr);
        System.out.println("The single element is: " + ans);
    }

    
    
}
