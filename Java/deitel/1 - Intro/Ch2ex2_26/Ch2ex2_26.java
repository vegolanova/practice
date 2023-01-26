import java.util.Scanner;

public class Ch2ex2_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input 1st integer: ");
        int num1 = input.nextInt();

        System.out.print("Input 2nd integer: ");
        int num2 = input.nextInt();

        if ((num1 * 3) % (num2 * 2) == 0) {
            System.out.printf("Tripled %d = %d%nDoubled %d = %d%n" +
                    "%d is a multiple of %d", num1, num1 * 3, num2, num2 * 2,
                    num1 * 3, num2 * 2);
        } else {
            System.out.printf("Tripled %d = %d%nDoubled %d = %d%n" +
                            "%d is NOT a multiple of %d", num1, num1 * 3, num2, num2 * 2,
                    num1 * 3, num2 * 2);
        }
    }
}
