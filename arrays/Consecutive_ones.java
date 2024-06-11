public class Consecutive_ones {
    public static int ones(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                count=0;  
            }
            continue;


        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr={1,0,1,1,1};
        System.out.println("The number of consequtive ones is "+ones(arr));
    }

    
}
