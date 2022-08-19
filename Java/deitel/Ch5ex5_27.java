import java.util.Scanner;

public class Ch5ex5_27 {
    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;

        } else if (num1 == 0) {
            return num2;

        } else {
            int remainder = num1 % num2;

            while (remainder != 0) {
                num1 = num2;
                num2 = remainder;
                remainder = num1 % num2;
            }

            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Calculate GCD of two numbers.\nInput first number: ");
        int num1 = input.nextInt();

        System.out.print("Input second number: ");
        int num2 = input.nextInt();

        System.out.printf("GCD(%d, %d) = %d%n", num1, num2, gcd(num1, num2));
    }
}
