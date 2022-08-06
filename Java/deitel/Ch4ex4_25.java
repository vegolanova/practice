import java.util.Scanner;

public class Ch4ex4_25 {
    public static void main(String[] args) {
        int rows, middle, errRange = 0, errEven = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Input an odd number in range [1;19] : ");
        rows = input.nextInt();

        if (rows < 1 || rows > 19) {
            System.out.println("Number out of range. Try again.");
            errRange = 1;
        }

        if (rows % 2 == 0) {
            System.out.println("This is an EVEN number. Try again.");
            errEven = 1;
        }

        middle = (rows - 1) / 2 + 1;

        for (int i = 1; i <= rows; i++) {
            if (errEven == 1 || errRange == 1) {
                break;
            }

            if (i <= middle) {
                for (int j = middle - 1; j >= i; j--) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }

                for (int k = 2; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();

            } else {
                for (int j = 0; j < i - middle; j++) {
                    System.out.print(" ");
                }

                for (int k = middle; k > i - middle; k--) {
                    System.out.print("*");
                }

                for (int k = middle - 1; k > i - middle; k--) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}
