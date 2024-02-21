// 1111
// 222
// 33
// 4


public class pattern_13 {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(i);

            }
            System.out.println();
        }
    }

}
