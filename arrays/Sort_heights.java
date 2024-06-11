import java.util.ArrayList;
import java.util.Arrays;

public class Sort_heights {
    public static ArrayList<Integer> sort(int arr[]) {
        int[] Arraysorted = arr.clone();
        Arrays.sort(arr);

        ArrayList<Integer> mismatchedIndex = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Arraysorted[i]) {
                mismatchedIndex.add(i);
            }

        }
        return mismatchedIndex;
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,8,5,6,7};
        ArrayList<Integer> heights = sort(arr);
        if (heights.size() != 0) {
            System.out.print("the mismatched indexes are ");
            for (int i = 0; i < heights.size(); i++) {
                System.out.print(arr[i]+" ");

            }

        }else{
            System.out.println("All indexes match");
        }

    }

}
