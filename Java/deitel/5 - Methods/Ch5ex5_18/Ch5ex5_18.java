import java.util.Scanner;

public class Ch5ex5_18 {
    public static void squareOfAsterisks(int qty) {
        for (int i = 0; i < qty; i++) {
            for (int j = 0; j < qty; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number of asterisks to print a square: ");
        int num = input.nextInt();

        squareOfAsterisks(num);
    }
}
