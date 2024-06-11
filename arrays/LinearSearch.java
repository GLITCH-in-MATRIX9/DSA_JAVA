public class LinearSearch {
    static boolean linearsearch(int arr[],int num,int number){
        for(int i=0;i<num;i++){
            if(arr[i]==number){
                return true;
            }
        }
        return false;


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int number_to_search=6;
        System.out.println(linearsearch(arr, n,number_to_search));
        

    }
    
}
