//to check if the array is sorted
public class CheckSorting {
    public static boolean Sortingcheck(int arr[], int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    return false;

                }

            }

        }
        return true;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2,3,4,5 };
        int n = arr.length;
        System.out.println(Sortingcheck(arr,n));
        

    }

}
