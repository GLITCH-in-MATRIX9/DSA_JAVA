package BasicMath;
// calculate gcd using java 
// gcd is the greatest common divisor
// modulo(%) ---> remainder

public class Gcd {
    public static int findGcd(int n1, int n2) {
        int gcd=1;

        for(int i=0;i<Math.min(n1,n2);i++){
            
            if(n1%i==0 && n2%i==0){       //check if i is common

                gcd=i;


            }

        }


        return gcd;
    }
    
    
}
