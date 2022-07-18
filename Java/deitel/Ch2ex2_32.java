import java.util.Scanner;

public class Ch2ex2_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveCounter = 0;
        int negativeCounter = 0;
        int counter = 1;

        while (counter <= 5) {
            System.out.printf("Input integer #%d: ", counter);
            int num = input.nextInt();
            if (num < 0) {
                negativeCounter++;
            } else {
                positiveCounter++;
            }
            counter++;
        }
        System.out.printf("Total positive integers: %d%n Total negative integers: %d%n",
                positiveCounter, negativeCounter);
    }
}
