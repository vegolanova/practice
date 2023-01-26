import java.util.Scanner;

public class Ch5ex5_26 {
    public static int sumOfDigits(int num) {
        int digit1 = num / 1000;
        int digit2 = (num / 100) % 10;
        int digit3 = (num / 10) % 10;
        int digit4 = num % 10;

        return digit1 + digit2 + digit3 + digit4;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a 4-digit number: ");
        int num = input.nextInt();

        if (num < 1000 || num > 9999) {
            System.out.println("Wrong number of digits in an input number.");
        } else {
            System.out.printf("The sum of digits in a number %d: %d", num, sumOfDigits(num));
        }
    }
}
