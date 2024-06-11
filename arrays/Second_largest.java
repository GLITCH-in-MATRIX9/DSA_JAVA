public class Second_largest {
    public static int SecondLargest(int arr[], int n) {
        if (n < 2) {
            return -1;

        }
        int first= Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];

            }else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        // If second largest doesn't change, that means there's no second distinct largest element
        if (second == Integer.MIN_VALUE) {
            return -1;
        } else {
            return second;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 3, 10 };
        int n = arr.length;
        int secondLargest = SecondLargest(arr, n);
        System.out.println("The second largest element is: " + secondLargest);
    }
}
