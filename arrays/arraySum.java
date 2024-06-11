
import java.util.Scanner;

public class arraySum {
    public static int arraysum(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = arraysum(arr, n);
        System.out.println(sum);
        
        sc.close();
    }
    
    

}
