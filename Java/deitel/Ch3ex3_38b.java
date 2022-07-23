import java.util.Scanner;

public class Ch3ex3_38b {
    public static void main(String[] args) {
        int num, counter = 1, denominator = 1;
        double e = 1.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of desired terms to calculate e: ");
        num = input.nextInt();

        while (counter <= num) {
            denominator *= counter;
            e += (double) 1 / denominator;

            counter++;
        }

        System.out.printf("Value of e for %d terms: %f", num, e);
    }
}
