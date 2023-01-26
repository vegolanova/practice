import java.util.Scanner;

public class Ch4ex4_17 {
    public static void main(String[] args) {
        String student;
        int countA = 0, countB = 0, countC = 0, countD = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Input student name: ");
            student = input.nextLine();

            System.out.print("Input student grade (A-D): ");
            String grade = input.nextLine();

            switch (grade) {
                case "A":
                    countA++;
                    break;

                case "B":
                    countB++;
                    break;

                case "C":
                    countC++;
                    break;

                case "D":
                    countD++;
                    break;

                default:
                    System.out.println("Wrong type of grade. Try again.");
            }
        }

            System.out.printf("%n%s%12s%n  %s%12d%n  %s%12d%n  %s%12d%n  %s%12d%n",
                    "Grade", "Count", "A", countA, "B", countB, "C", countC, "D", countD);

    }
}
