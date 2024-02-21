
// 1=1
// 1+2=3
// 1+2+3=6
// 1+2+3+4=10
// 1+2+3+4+5=15


public class pattern_12 {
    public static void main(String[] args) {
        int n = 5; // Number of lines we want to print
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println(generatePattern(i) + "=" + sum);
        }
    }

    //pattern maker
    public static String generatePattern(int n) {
        StringBuilder pattern = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            pattern.append(i);
            if (i < n) {
                pattern.append("+");
            }
        }
        return pattern.toString();
    }
}


