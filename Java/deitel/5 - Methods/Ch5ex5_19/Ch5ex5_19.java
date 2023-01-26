import java.util.Scanner;

public class Ch5ex5_19 {
    public static void squareOfAsterisks(int qty, char fillCharacter) {
        for (int i = 0; i < qty; i++) {
            for (int j = 0; j < qty; j++) {
                System.out.printf("%s", fillCharacter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a character to fill the square: ");
        char fill = input.next().charAt(0);

        System.out.print("Input a number of characters to print a square: ");
        int num = input.nextInt();

        squareOfAsterisks(num, fill);
    }
}
