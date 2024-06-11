package BasicMath;

public class ReverseNumber {
    public int reverse(int x) {
        int revNum=0;
        while(x!=0){
            int digit=x%10;
            revNum=revNum*10+digit;
            x/=10;

            

        }
        return revNum;
        
    }
    
    
}
