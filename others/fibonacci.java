    import java.util.Scanner;


    public class fibonacci {
        public static int findfibonacci(int n){
            if(n==1 || n==2){
                return -1;
            }
            //initialising the first 2 numbers which are always 1 and 1 
            int a=1,b=1;
            for(int i=3;i<=n;i++){
                int next=a+b;
                a=b;
                b=next;

            }
            return b;

            
        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the position of your fibonacci number");
            int a =sc.nextInt();
            System.out.println(findfibonacci(a));



            
        }

        
    }
