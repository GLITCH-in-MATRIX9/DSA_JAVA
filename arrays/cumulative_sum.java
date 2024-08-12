public class cumulative_sum {
    public static int[] getCumulativeSum(int[] arr) {
        int n = arr.length;
        
        int[] newArr = new int[n];
        newArr[0] = arr[0];
        
        for (int i = 1; i < n; i++) {
            newArr[i] = newArr[i - 1] + arr[i];
        }
        
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] cumulativeSum =getCumulativeSum(arr);
        
        for (int num : cumulativeSum) {
            System.out.print(num+" ");
        }
    }


}
