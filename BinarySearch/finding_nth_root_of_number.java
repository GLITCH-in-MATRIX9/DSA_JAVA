package BinarySearch;


public class finding_nth_root_of_number {
    public static int NthRoot(int n,int m){
        for(int i=1;i<m;i++){
            if(Math.pow(i, n)==m){
                return i;

            }
        }
        return 1;

    }

    public static void main(String[] args) {
        int n = 2, m = 144;
        int ans = NthRoot(n, m);
        System.out.println("The answer is: " + ans);
    }

    
    
}
