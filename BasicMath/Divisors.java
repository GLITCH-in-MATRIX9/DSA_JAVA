package BasicMath;
import java.util.Scanner;

public class Divisors {
    public static int[] alldivisor(int n, int[] size){
        int [] divisors=new int [n];
        int count=0;

        for(int i=0;i<n-1;i++){
            if(n%i==0){
                divisors[count++]=i;

            }

        }
        size[0]=count;
        return divisors;



      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check Divisor");
        int num=sc.nextInt();
        int [] size =new int[1];
        int[] divisors = alldivisor(num, size);

        System.out.println("the divisors are");
        for(int i=0;i<size[0];i++){
            System.out.print(divisors[i]+" ");
        }
        System.out.println();
        divisors = null;

    }
    
}
