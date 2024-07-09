package build.Debug;

public class Prefix {
    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()) {
                    return "none";
                }

            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs1 = { "flower", "flow", "flight" };
        String[] strs2 = { "dog", "racecar", "car" };

        System.out.println(
                "Longest common prefix of [\"flower\",\"flow\",\"flight\"]: \"" + longestCommonPrefix(strs1) + "\"");
        System.out.println(
                "Longest common prefix of [\"dog\",\"racecar\",\"car\"]: \"" + longestCommonPrefix(strs2) + "\"");

    }

}
