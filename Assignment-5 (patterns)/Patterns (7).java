public class pattern_17 {
    public static void main(String[] args) {
        int num = 4;

        // Upper part
        for (int i = num; i >= 1; i--) {
            for (int j = num; j > i; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(i);
            }
            for (int j = i + 1; j <= num; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Lower part
        for (int i = 2; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(i);
            }
            for (int j = i + 1; j <= num; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
