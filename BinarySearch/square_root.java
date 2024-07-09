package BinarySearch;

public class square_root {
    public static int floorSqrt(int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i * i == n) {
                return i;
            }
        }
        return -1;

    }
    //else method 2
    // public static int floorSqrt(int n) {
    //     int ans = (int) Math.sqrt(n);
    //     return ans;
    // }


    // else method 3
    

    public static void main(String[] args) {
        int n = 21;
        int ans = floorSqrt(n);
        if(ans==-1){
            System.out.println("no answer found");
        }
        else{
            System.out.println("The floor of square root of " + n + " is: " + ans);
        }
        
    }
}