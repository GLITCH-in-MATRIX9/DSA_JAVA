public class String_rotation {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;


        }
        String concatenated=goal+goal;
        return concatenated.contains(s);
        
    }
    
}
