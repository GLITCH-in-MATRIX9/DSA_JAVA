import java.util.Arrays;
import java.util.Scanner;

public class array_3 {
    public static int print2largest(int arr[], int n) {
        Arrays.sort(arr);
        for (int i =n-1; i >= 1; i--) {
            if (arr[i-1] != arr[i]) {
                return arr[i-1];

            }

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = { 10, 5, 10 };
        int ans = print2largest(array, array.length);
        System.out.println("The second largest element is " + ans);

    }

}
