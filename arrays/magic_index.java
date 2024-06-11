
import java.util.ArrayList;
import java.util.Scanner;


public class magic_index {

    public static int magicIndex(ArrayList<Integer> a, int n) {
        for(int i=0;i<n;i++){
            if(a.get(i)==i){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "This code helps you find an index that matched with it's numerical value/n please enter the number of test cases");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("please enter size of your array");
            ArrayList<Integer> arr = new ArrayList<>();
            System.out.println("enter numbers of your array now");

            for (int j = 0; j < n; j++) {
                arr.add(sc.nextInt());
            }
            System.out.println("Test Case " + (i + 1) + ": " + magicIndex(arr, n));

        }
    }
}
