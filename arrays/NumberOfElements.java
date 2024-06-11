import java.util.Scanner;

public class NumberOfElements {
    static void Number(int arr[], int num) {
        boolean visited[] = new boolean[num];   //create a new array to store true or false for array
        int minValue=Integer.MAX_VALUE;
        int minElement=-1;

        for (int i = 0; i < num; i++) {
            if (visited[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < num; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }

            }
            System.out.println(arr[i] + " appears " + count + " times");
            if(count<minValue){
                minValue=count;
                minElement=arr[i];

            }
        


        }
        System.out.println("Element with the minimum frequency: " + minElement + " (Frequency: " + minValue + ")");


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements are there in your array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Number(arr, n);
        sc.close();

    }

}
