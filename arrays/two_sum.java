import java.util.ArrayList;

public class two_sum {
    public static void twosum(int[] arr, int target) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[i] + arr[j] == target) {
                    indexes.add(j);
                    indexes.add(i);
                    System.out.println("The indexes that match the target "+ target +" are at index " + i +" which is  "+ arr[i]+" and index " + j +" which is  "+ arr[j]);
                    System.out.println();

                }

            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7 };
        int target = 8;
        twosum(arr, target);

    }

}
