import java.security.SecureRandom;
import java.util.Scanner;

public class Ch5ex5_35 {
    private static int questionGenerator() {
        SecureRandom random = new SecureRandom();
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        System.out.printf("How much is %d times %d?%n", num1, num2);
        return num1 * num2;
    }

    private static void answerCheck(int answer) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your answer: ");
        int userAnswer = input.nextInt();
        while (userAnswer != answer) {
            System.out.print("Wrong! Try again.\nYour answer: ");
            userAnswer = input.nextInt();
        }
        System.out.println("Correct!\n");
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
