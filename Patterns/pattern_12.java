import java.util.Scanner;

public class pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();
        int sum=0,res=0;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(res+" ");
                if(res==0)
                res=1;
                else{
                    int prev=res;
                    res+=sum;
                    sum=prev;
                }               
            }
            System.out.println();
        }
        sc.close();
    }    
}