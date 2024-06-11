import java.util.Scanner;

public class pattern_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int k=i;
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }

            for(int j=1;j<=(2*n)-(2*i)-1;j++)
            System.out.print(" ");
            if(i==n){
                k-=1;
            }
            for(int j=k;j>0;j--){
                System.out.print((j)+"");
            }
            
            System.out.println();
        }
        
        sc.close();
    }
}