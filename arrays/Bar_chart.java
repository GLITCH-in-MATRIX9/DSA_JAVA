import java.util.Scanner;

public class Bar_chart {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number of bars");
        int bars = sc.nextInt();
        int[] arr = new int[bars];
        System.out.println("enter the y value of your bars one by one");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        for(int floor=max;floor>0;floor--){
           for(int i=0;i<arr.length;i++){
            if(arr[i]>=floor){
                System.out.print("*\t");

            }else{
                System.out.print("\t");
            }
           }
           System.out.println();
        }

    }

}
