import java.util.ArrayList;
import java.util.Scanner;

// (Using the Enhanced for Statement) Write an application that uses an enhanced for statement
// to find the absolute values of int numbers (модуль) passed by command-line arguments.
public class Ch6ex6_16 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer or 'x' to stop: ");

        while (input.hasNextInt()) {
            integers.add(input.nextInt());
            System.out.print("Input an integer or 'x' to stop: ");
        }

        if (integers.size() == 0) {
            System.out.println("No values!");
        }

        for (Integer integer : integers) {
            if (integer < 0) {
                integer *= -1;
            }
            System.out.println(integer);
        }

    }
}
