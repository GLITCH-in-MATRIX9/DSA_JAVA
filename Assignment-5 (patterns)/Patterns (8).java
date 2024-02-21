//     *****
//    *   *
//   *   *
//  *   *
// *****



public class pattern_18 {
    public static void main(String[] args) {
        int size = 5; // Size of the rhombus

        // Upper half of the rhombus
        for (int i = 1; i <= size; i++) {
            // Print spaces for indentation
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Print stars or spaces
            for (int j = 1; j <= size; j++) {
                if (j == 1 || j == size || i == 1 || i == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // space
                }
            }
            System.out.println();
        }
    }
}
