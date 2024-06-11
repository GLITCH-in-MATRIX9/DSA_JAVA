import java.util.Scanner;

public class pattern_11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n=sc.nextInt();
        int k=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();

        }
        sc.close();
    }
}