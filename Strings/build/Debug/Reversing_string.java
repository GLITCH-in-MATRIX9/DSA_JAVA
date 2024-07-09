package build.Debug;

public class Reversing_string {
    public static String result(String s) {
       String[] words=s.trim().split("\\s+");  //s.trim() removes any leading and trailing spaces from the input string s.
    //    s.split("\\s+") splits the trimmed string into an array of words using one or more spaces as the delimiter.
       StringBuilder reversed = new StringBuilder();
       for(int i=words.length-1;i>=0;i--){    
        reversed.append(words[i]);
        if(i>0){
            reversed.append(" ");
        }


       }
       return reversed.toString();
    }

    public static void main(String[] args) {
        String st = "TUF is great for interview preparation";
        System.out.println("Before reversing words: ");
        System.out.println(st);
        System.out.println("After reversing words: ");
        System.out.print(result(st));
    }

}
