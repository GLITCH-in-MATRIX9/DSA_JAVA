import java.util.* ;

public class largestnumber {
    static int largestElement(int[] arr, int n) {
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }

        return largest;
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of values in array");
        int n=sc.nextInt();
        System.out.println("enter your elements in array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int largest=largestElement(arr, n);
        System.out.println("your largest value is "+largest);
        sc.close();

    }
}
