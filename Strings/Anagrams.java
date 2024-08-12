import java.util.Arrays;

public class Anagrams {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        //convert the string to character array first
        char[] schars=s.toCharArray();
        char[] tchars=t.toCharArray();

        Arrays.sort(schars);
        Arrays.sort(tchars);

        return Arrays.equals(schars,tchars);
        
    }
    
}
