import java.util.*;

public class Capital_letter {

    public static String convertString(String str) {
        String [] words=str.split(" ");
        StringBuilder result = new StringBuilder();
        //here word is just like i in for loop
        for(String word: words){
            if(!word.isEmpty()){
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");

            }

        }



        return result.toString().trim();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of test-cases");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.println("enter your sentences one by one");
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            System.out.println(convertString(str));

        }
        sc.close();

    }
}
