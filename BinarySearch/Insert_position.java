package BinarySearch;

public class Insert_position {
    public static int searchInsert(int[] arr, int n) {
        int length = arr.length;
        int left = 0;
        int right = length - 1;
        int ans = length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= n) {
                ans = mid;

                right = mid - 1;

            } else {
                left = mid + 1;
            }

        }

        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7 };
        int x = 6;
        int ind = searchInsert(arr, x);
        System.out.println("The index is: " + ind);
    }

}
