public class Frequency_of_most_frequent_element {
    public static int maxfreq(int arr[],int k){
        int left=0;
        int window_ka_pehle_sum=0;
        int ans=0;
        for(int right=0;right<arr.length;right++){
            int target=arr[right];
            window_ka_pehle_sum+=target;

            while((right-left+1)*target-window_ka_pehle_sum>k){   //right-left+1 is the size of window and (right-left+1)*target-window_sum is the after 
                                                        // they become the right most element --->uske baad ka sum and then we subtract window_sum because kitna aur chhaiye pata chal jaega 
                window_ka_pehle_sum-=arr[left];       //kyunki k se jyada values jaa rhi hai toh ek aage wala element subtract/hata do
                left++;                                // aur ek aage shift ho jao index



            }
            ans=Math.max(ans, right-left+1);

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5};
        int k=5; //it is the max operations allowed
        System.out.println(" Maximmum frequency of element at most "+k+" operations is "+maxfreq(arr,k));

    }
    
}
