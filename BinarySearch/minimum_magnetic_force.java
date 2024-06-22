package BinarySearch;

import java.util.Arrays;

public class minimum_magnetic_force {
    public static boolean canPlaceBalls(int[] position, int m, int min_distance) {

        
        return true;
        
    }
    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left=1;
        int right=position[position.length-1]-position[0]; //maximum possible distance
        int result=0;

        while (left<=right) {
            int mid=left+(right-left)/2;
            if (canPlaceBalls(position, m, mid)){
                result=mid;
                left=mid+1;

            }
            else{

            }
        }
       
        for()
        return -1;
        
    }

    public static void main(String[] args) {

        
    }
    
}
