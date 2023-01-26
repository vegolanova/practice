import java.util.Scanner;

public class Ch3ex3_23 {
    public static void main(String[] args) {
        int currentNum, largest, secondLargest, counter = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        currentNum = input.nextInt();
        largest = currentNum;
        secondLargest = currentNum;

        while (counter < 9) {
            System.out.print("Input a number: ");
            currentNum = input.nextInt();

            if (currentNum > largest) {
                secondLargest = largest;
                largest = currentNum;
            }

            if (currentNum < largest && currentNum > secondLargest) {
                secondLargest = currentNum;
            }
            counter++;
        }
        System.out.printf("Second largest: %d%nLargest: %d", secondLargest, largest);
    }
}
