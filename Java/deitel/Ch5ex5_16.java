import java.util.Scanner;

public class Ch5ex5_16 {
    public static boolean isMultiple(int num1, int num2) {
        return num1 % num2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Input values of two integers to determine if the second
                integer is a multiple of the first integer.
                To stop enter 0.""");

        System.out.print("\nInput first integer: ");
        int num1 = input.nextInt();

        while (num1 != 0) {

            System.out.print("Input second integer: ");
            int num2 = input.nextInt();

            boolean result = isMultiple(num1, num2);

            if (result) {
                System.out.printf("%d is a multiple of %d%n", num2, num1);
            } else {
                System.out.printf("%d is NOT a multiple of %d%n", num2, num1);
            }

            System.out.println("\nNEXT PAIR\n");

            System.out.println("""
                    Input values of two integers to determine if the second
                    integer is a multiple of the first integer.
                    To stop enter 0.""");

            System.out.print("\nInput first integer: ");
            num1 = input.nextInt();
        }
    }
}
