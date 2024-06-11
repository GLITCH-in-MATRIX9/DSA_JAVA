
class evenlyDivides{
    static int evenlyDivide(int N){
        int count=0;
        int originalNumber=N;

        while(N>0){
            int digit=N%10;
            N/=10;
            if(digit!=0 && originalNumber%digit==0){      //checking if the number is divisible by all the digits 
                count++;
            }
        }
        return count;
        



        
    }
}