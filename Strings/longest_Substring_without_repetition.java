public class longest_Substring_without_repetition {
    public static int longest_substring(String s){
        int maximum=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(allunique(s,i,j)){
                    maximum=Math.max(maximum, j-i+1);
                }
            }
        }

        return maximum;

    }

    public static boolean allunique(String s,int start,int end){
        boolean[] chars =new boolean[128];
        for(int i=start;i<end;i++){
            if(chars[s.charAt(i)]){
                return false;
            }
            chars[s.charAt(i)]=true;

        }
        return true;
        

    }
    
}
