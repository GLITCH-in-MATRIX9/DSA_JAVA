public class ReverseArray {

    static void reverseArray(int arr[], int n) {
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {10,20,30,40,60};
        reverseArray(arr, n);

        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}




// number 54321
// index  01234