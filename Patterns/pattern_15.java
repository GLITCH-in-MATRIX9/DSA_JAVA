import java.util.Scanner;

public class pattern_15 {
     public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.print("Enter number of rows: ");
        n=sc.nextInt();
        int k;
        for(int i=1;i<=n;i++){
            k=i;
            for(int j=1;j<=n-i;j++)
            System.out.print("\t");

            for(int j=1;j<=i;j++){
            
                System.out.print(k+"\t");
                
                k++;
            }
            int p=k-2;
            for(int j=1;j<i;j++){
                System.out.print((p)+"\t");
                p--;
            }
            
            System.out.println();
        }

        
        for(int i=n-1;i>0;i--){
            int a=i;
            for(int j=1;j<=n-i;j++)
            System.out.print("\t");

            for(int j=1;j<=i;j++){
                System.out.print(a+"\t");
                a++;
            }
            int b=a-2;
            for(int j=1;j<i;j++){
                System.out.print(b+"\t");
                b--;
            }
            System.out.println();
        }
        sc.close();
    }  
}
