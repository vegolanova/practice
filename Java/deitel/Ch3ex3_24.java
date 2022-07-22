import java.util.Scanner;

public class Ch3ex3_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10 && studentCounter > 0) {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            if (result == 1) {
                passes = passes + 1;
                studentCounter++;

            } else if (result == 2) {
                failures =failures + 1;
                studentCounter++;

            } else {
                System.out.println("Please enter either 1 for pass or 2 for failure.");
            }
        }

        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }
    }
}
