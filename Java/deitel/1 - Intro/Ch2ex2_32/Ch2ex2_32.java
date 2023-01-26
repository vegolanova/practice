import java.util.Scanner;

public class Ch2ex2_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;
        int counter = 1;

        while (counter <= 5) {
            System.out.printf("Input integer #%d: ", counter);
            int num = input.nextInt();
            if (num < 0) {
                negativeCounter++;
            } else if (num > 0) {
                positiveCounter++;
            } else {
                zeroCounter++;
            }
            counter++;
        }
        System.out.printf("Total positive integers: %d%nTotal negative integers: %d%n" +
                        "Total zeros: %d", positiveCounter, negativeCounter, zeroCounter);
    }
}
