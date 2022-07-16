import java.util.Scanner;

public class Ch2ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int num1 = input.nextInt();

        System.out.print("Input second integer: ");
        int num2 = input.nextInt();

        int square1 = num1 * num1;
        int square2 = num2 * num2;

        int squareSum = square1 + square2;
        int squareDif = square1 - square2;

        System.out.printf("1st number squared: %d%n2nd number squared: %d%n" +
                "Sum of squares: %d%nDifference of squares: %d%n",
                square1, square2, squareSum, squareDif);
    }
}
