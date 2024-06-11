
import java.util.Scanner;
public class palindrome {
    public static boolean checkPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left=0,right=str.length()-1;
        while(left<right){
            if (str.charAt(left)!=str.charAt(right)){
                return false;

            }
            left++;
            right--;
        }
        return true;

	}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter text to be verified for palindrome");
        String a=sc.nextLine();
        if(checkPalindrome(a)==true){
            System.out.println("true");
        }else{
            System.out.println(false);
        }
        sc.close();


    }
    

    
}
