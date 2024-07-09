package build.Debug;

public class remove_paranthesis {
    public static String removeOuterParantheses(String s){
        StringBuilder result=new StringBuilder();
        int depth=0;

        for(char c:s.toCharArray()){
            if(c=='('){ //if we have a opening bracket
                if(depth>0){     //we check if the depth of the stack is greater than zero 
                    result.append(c);  // we just add that bracket to the result stringbuilder 
                }
                depth++;  //just let the stack know you have added one element and its not empty
            }else{
                depth--;   //if the bracket is closing or if the bracket is a closing bracket then subtract that 
                if(depth>0){  //if the stack is still not empty 
                    result.append(c); //there must be a inner closing bracket append it into the result StringBuilder
                }
            }
            
        }
        
       
        return result.toString();
    }


    public static void main(String[] args) {
        String test1 = "(()())(())";
        String test2 = "(()())(())(()(()))";
        String test3 = "()()";
        
        System.out.println("Original: " + test1);
        System.out.println("Processed: " + removeOuterParantheses(test1));
        System.out.println();

        System.out.println("Original: " + test2);
        System.out.println("Processed: " + removeOuterParantheses(test2));
        System.out.println();

        System.out.println("Original: " + test3);
        System.out.println("Processed: " + removeOuterParantheses(test3));

    }
    
}
    