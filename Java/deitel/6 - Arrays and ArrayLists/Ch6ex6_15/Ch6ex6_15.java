import java.util.ArrayList;
import java.util.Scanner;

// (Command-Line Arguments) Write a program that takes command-line arguments and
// computes the average of their maximum and minimum. Make sure there are command-line arguments
// being passed before you attempt to compute anything.

public class Ch6ex6_15 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer or 'x' to stop: ");

        while(input.hasNextInt()) {
            int userInput = input.nextInt();
            integers.add(userInput);
            System.out.print("Input an integer or 'x' to stop: ");
        }

        try {
            integers.sort(null);
            int min = integers.get(0);
            int max = integers.get(integers.toArray().length);
        } catch (ArithmeticException e) {
            System.out.println("Array is empty!");
        }

    }
}
