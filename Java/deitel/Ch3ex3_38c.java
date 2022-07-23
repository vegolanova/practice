import java.util.Scanner;

public class Ch3ex3_38c {
    public static void main(String[] args) {
        int terms, power, counter = 1, denominator = 1;
        double e = 1.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the desired power to calculate e: ");
        power = input.nextInt();

        System.out.print("Input the number of desired terms to calculate e: ");
        terms = input.nextInt();

        while (counter <= terms) {
            denominator *= counter;
            e += (double) Math.pow(power, counter) / denominator;

            counter++;
        }

        System.out.printf("Value of e for %d terms: %f", terms, e);
    }
}
