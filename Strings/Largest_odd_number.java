package build.Debug;

public class Largest_odd_number {
    public static String largestOddNumber(String s){
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if((c-'0')% 2!=0){
                return s.substring(0,i+1);
            }
        }return "";
    }
    public static void main(String[] args) {
        String num1 = "52";
        String num2 = "4206";
        String num3 = "35427";
        
        System.out.println("Largest odd substring of \"" + num1 + "\": \"" + largestOddNumber(num1) + "\"");
        System.out.println("Largest odd substring of \"" + num2 + "\": \"" + largestOddNumber(num2) + "\"");
        System.out.println("Largest odd substring of \"" + num3 + "\": \"" + largestOddNumber(num3) + "\"");
    
    }
    
}
