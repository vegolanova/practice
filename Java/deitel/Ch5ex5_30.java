import java.security.SecureRandom;
import java.util.Scanner;

public class Ch5ex5_30 {
    private static int randomNumber() {
        SecureRandom randomNumbers = new SecureRandom();
        return 1 + randomNumbers.nextInt(1000);
    }

    private static int playerGuess() {
        Scanner input = new Scanner(System.in);
        System.out.print("Your guess: ");
        return input.nextInt();
    }

    private static void guessStatus(int guess, int answer) {
        if (guess < 1 || guess > 1000) {
            System.out.println("Guess out of range! Try again.");
        } else if (guess < answer) {
            System.out.println("Your guess is smaller than the answer!");
        } else if (guess > answer) {
            System.out.println("Your guess is bigger than the answer!");
        } else {
            System.out.println("Congratulations! You won!\n");
        }
    }

    private enum ContinuationStatus {PLAY, END, ERROR}

    private static ContinuationStatus continuationStatus() {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                Would you like to play again?
                Input 1 to play again. Input -1 to quit.
                Your input:\s""");

        int userResponse = input.nextInt();

        if (userResponse == 1) {
            return ContinuationStatus.PLAY;
        } else if (userResponse == -1) {
            return ContinuationStatus.END;
        } else {
            return ContinuationStatus.ERROR;
        }
    }

    private static void play() {
        int answer = randomNumber();

        System.out.println("Guess the number in range [1; 1000]!");
        int guess = playerGuess();
        guessStatus(guess, answer);

        while (guess != answer) {
            System.out.println(answer);
            guess = playerGuess();
            guessStatus(guess, answer);
        }

        ContinuationStatus gameStatus = continuationStatus();

        if (gameStatus == ContinuationStatus.ERROR) {
            while (gameStatus == ContinuationStatus.ERROR) {
                System.out.println("Input out of range!\n");
                gameStatus = continuationStatus();
            }
        }

        if (gameStatus == ContinuationStatus.PLAY) {
            play();
        } else {
            System.out.println("FIN");
        }
    }

    public static void main(String[] args) {
        play();
    }
}
