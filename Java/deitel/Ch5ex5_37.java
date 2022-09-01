import java.security.SecureRandom;
import java.util.Scanner;

public class Ch5ex5_37 {
    private static int questionGenerator() {
        SecureRandom random = new SecureRandom();
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        System.out.printf("%nHow much is %d times %d?%n", num1, num2);
        return num1 * num2;
    }

    private static void userResponse() {
        int attemptsCounter = 0, correctAttemptsCounter = 0;
        Scanner input = new Scanner(System.in);

        while (attemptsCounter < 10) {
            int answer = questionGenerator();
            System.out.println("Your answer: ");
            int userAnswer = input.nextInt();
            SecureRandom random = new SecureRandom();
            int responseID = random.nextInt(4);

            while (userAnswer != answer) {
                switch (responseID) {
                    case 0 -> System.out.println("No. Please try again.");
                    case 1 -> System.out.println("Wrong. Try once more.");
                    case 2 -> System.out.println("Don't give up!");
                    case 3 -> System.out.println("No. Keep trying.");
                }
                responseID = random.nextInt(4);
                System.out.print("Wrong. Try again.\nYour answer: ");
                userAnswer = input.nextInt();
                attemptsCounter++;

                if (attemptsCounter > 8) {
                    break;
                }
            }

            if (attemptsCounter > 8) {
                break;
            }

            responseID = random.nextInt(4);
            switch (responseID) {
                case 0 -> System.out.println("Very good!");
                case 1 -> System.out.println("Excellent!");
                case 2 -> System.out.println("Nice work!");
                case 3 -> System.out.println("Keep up the good work!");
            }
            attemptsCounter++;
            correctAttemptsCounter++;
        }
        performanceEvaluation(correctAttemptsCounter);
    }

    private static void performanceEvaluation(int correctAnswers) {
        int successRate = correctAnswers * 10;

        if (successRate >= 75) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        } else {
            System.out.println("Please ask your teacher for extra help.");
        }
    }

    public static void main(String[] args) {
        while (true) {
            userResponse();
        }
    }
}
