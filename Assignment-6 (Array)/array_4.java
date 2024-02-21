import java.util.Scanner;

public class array_4 {
    public static int print2largest(int arr[], int n) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }

        return max - min;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 9 };
        int ans = print2largest(array, array.length);
        System.out.println("The difference is " + ans);

    }

}