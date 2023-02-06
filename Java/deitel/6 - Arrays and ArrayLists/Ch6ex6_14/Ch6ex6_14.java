import java.util.ArrayList;
import java.util.Scanner;

/* (Variable-Length Argument List) Write an application that calculates the average of a series
        of integers that are passed to method average using a variable-length argument list. Test your method
        with several calls, each with a different number of arguments. */
public class Ch6ex6_14 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.print("Input an integer to add or 'x' to stop: ");

        while (input.hasNextInt()) {
            int num = input.nextInt();
            integers.add(num);
            sum += num;
            System.out.print("Input an integer to add or 'x' to stop: ");
        }

        int avg = 0;

        try {
            avg = sum / integers.toArray().length;
        } catch (ArithmeticException e) {
            System.out.println("Zero elements!");
        }

        System.out.println("The average: " + avg);
    }
}
