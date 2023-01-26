import java.util.Scanner;

public class Ch3ex3_21 {
    public static void main(String[] args) {
        int counter = 1, number, largest = 0;

        Scanner input = new Scanner(System.in);

        while (counter < 11) {
            System.out.print("Input number of units sold: ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.printf("Largest number of units sold: %d", largest);
    }
}
