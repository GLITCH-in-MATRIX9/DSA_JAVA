//    A
//   ABA
//  ABABA
// ABABABA



public class pattern_15 {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1|| j%2!=0) {
                    System.out.print("A");
                } else {
                    System.out.print("B");
                }
            }
            System.out.println();
        }
    }
}
