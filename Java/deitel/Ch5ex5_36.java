import java.security.SecureRandom;
import java.util.Scanner;

public class Ch5ex5_36 {
    private static int questionGenerator() {
        SecureRandom random = new SecureRandom();
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        System.out.printf("%nHow much is %d times %d?%n", num1, num2);
        return num1 * num2;
    }

    private static void answerCheck(int answer) {
        SecureRandom random = new SecureRandom();
        int responseID = random.nextInt(4);
        Scanner input = new Scanner(System.in);
        System.out.print("Your answer: ");
        int userAnswer = input.nextInt();

        while (userAnswer != answer) {
            switch (responseID) {
                case 0 -> System.out.println("No. Please try again.");
                case 1 -> System.out.println("Wrong. Try once more.");
                case 2 -> System.out.println("Don't give up!");
                case 3 -> System.out.println("No. Keep trying.");
            }
            responseID = random.nextInt(4);
            System.out.print("Your answer: ");
            userAnswer = input.nextInt();
        }

        responseID = random.nextInt(4);
        switch (responseID) {
            case 0 -> System.out.println("Very good!");
            case 1 -> System.out.println("Excellent!");
            case 2 -> System.out.println("Nice work!");
            case 3 -> System.out.println("Keep up the good work!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = questionGenerator();

        while (true) {
            answerCheck(answer);
            answer = questionGenerator();
        }
    }
}
