import java.security.SecureRandom;
import java.util.Scanner;

public class Ch5ex5_29 {
    public static enum CoinSide {HEAD, TAIL};
    public static CoinSide flipCoin() {
        CoinSide outcome = null;

        SecureRandom randomSide = new SecureRandom();
        int flipCoin = randomSide.nextInt(2);

        switch (flipCoin) {
            case 0 -> outcome = CoinSide.HEAD;
            case 1 -> outcome = CoinSide.TAIL;
        }
        return outcome;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CoinSide result;
        int headCounter = 0, tailCounter = 0;

        System.out.print("Flip the coin. To flip the coin enter 1, to stop enter -1." +
                "\nYour input: ");
        int continueStatus = input.nextInt();

        while (continueStatus != -1) {
            if (continueStatus == 1) {
                result = flipCoin();

                if (result == CoinSide.HEAD) {
                    headCounter++;
                } else {
                    tailCounter++;
                }

                System.out.printf("It's a %s. Stats so far:%n%s%10s%n%d%10d%n",
                        result, "HEADS", "TAILS", headCounter, tailCounter);

            } else {
                System.out.println("Wrong number input. Try again.");

            }
            
            System.out.print("""

                    Flip the coin. To flip the coin enter 1, to stop enter -1.
                    Your input:\s""");
            continueStatus = input.nextInt();
        }
        System.out.println("FIN\n");
    }
}
