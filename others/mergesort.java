public class mergesort {
    public static void conquer(int arr[] , int si, int mid, int ei){
        int merged[]=new int[ei-si+1];//naya array jaha pe abb values asc order me save hongi
        int idx1=si;
        int idx2=mid+1;
        int x=0;//merged wale ka indexing
        while(idx1<=mid && idx2<=ei){//we are checking is the indexes are smaller than their middle one and last one
            //we are arranging elements by traversing through the array
            if(arr[idx1]<=arr[idx2]){
                //moving the smaller element in merged array and going to the next element that's why ++
                merged[x++]=arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];    
            }
        }
        while(idx1<=mid){
            //if any remaining left over from first subarray then add it directly without comparing with second one 
            merged[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            merged[x++]=arr[idx2++];
        }
        //copying the merged array into original array
        for (int i = 0, j=si; i < merged.length ; i++,j++) {
            arr[j]=merged[i];
}   
    }
    //------isse we are dividing the code into smaller fragments-----
    public static void divide(int arr[], int si, int ei){
        if(si>=ei){//agar humara starting index hi ending index ho gya toh hum array ke end tak aagye hai na
            return;
        }
        int mid=si+(ei-si)/2;//isse middle value pata lagegi
        divide(arr,si,mid);//isme pehle wala half divide hoga
        divide(arr,mid+1,ei);//isme aage wala half divide hoga
        conquer(arr, si, mid, ei);//isse abb woh merge honge

    }
    public static void main(String args[]){
        int[] arr={6,3,9,5,2,8};
        int n=arr.length;
        divide(arr ,0,n-1);//because array length would be 6 but our ending index goes only till 5
        //print
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
    
}
