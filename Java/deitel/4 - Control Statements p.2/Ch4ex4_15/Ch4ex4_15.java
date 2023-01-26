public class Ch4ex4_15 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {

            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        for (int j = 0; j < 10; j++) {

            for (int k = 0; k < j; k++) {
                System.out.print(" ");
            }

            for (int i = 10; i > j; i--) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        for (int j = 0; j <= 10; j++) {

            for (int k = 10; k > j; k--) {
                System.out.print(" ");
            }

            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
