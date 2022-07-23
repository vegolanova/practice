import java.util.Scanner;

public class Ch3ex3_38a {
    public static void main(String[] args) {
        int num, counter = 1, factorial = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer to calculate its factorial: ");
        num = input.nextInt();

        while (counter <= num) {
            factorial *= counter;

            counter++;
        }

        System.out.printf("Factorial of a number %d: %d", num, factorial);
    }
}
