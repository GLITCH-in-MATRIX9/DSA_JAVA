public class Stcok_buy_and_sell {
    public static int maxProfit(int[] arr){
        int min_price=arr[0];
        int max_profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min_price){
                min_price=arr[i];
                
            }else{
                int potential_profit=arr[i]-max_profit;
                if(potential_profit>max_profit){
                    max_profit=potential_profit;
                }
            }
        }
        return max_profit;
        



    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
    }
    
}
