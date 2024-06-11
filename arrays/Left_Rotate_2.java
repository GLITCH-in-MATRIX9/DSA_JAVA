import java.util.Scanner;

public class Left_Rotate_2 {
    static void leftrotate2(int arr[], int digits, int num) {
        int firstElement = arr[0];

        for (int i = 1; i < num; i++) {
            arr[i - 1] = arr[i];

        }
        arr[num-1]=firstElement;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        int num = arr.length;
        System.out.println("enter the number of digits you want to shift by\n");

        int digits = sc.nextInt();
        for (int j = 0; j < digits; j++) {
            leftrotate2(arr, digits, num);
        }
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }

    }

}
