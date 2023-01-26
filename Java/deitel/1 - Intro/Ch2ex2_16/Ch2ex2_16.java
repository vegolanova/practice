import java.util.Scanner;

public class Ch2ex2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        int numSquared = num * num;

        if (num > 100 && numSquared > 100) {
            System.out.printf("%d and its square %d are greater than 100%n", num, numSquared);
        }
        if (num == 100 && numSquared == 100) {
            System.out.printf("%d and its square %d are equal to 100%n", num, numSquared);
        }
        if (num != 100 && numSquared != 100) {
            System.out.printf("%d and its square %d are not equal to 100%n", num, numSquared);
        }
        if (num < 100 && numSquared < 100) {
            System.out.printf("%d and its square %d are less than 100%n", num, numSquared);
        }
    }
}
