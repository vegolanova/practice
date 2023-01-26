import java.util.Scanner;

public class Ch6ex6_12 {
    public static void main(String[] args) {
        int[] tenValues = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            tenValues[i] = -1;
        }

        System.out.println("Input 10 integers in range [10; 100].");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Integer #%d: ", i + 1);
            int value = input.nextInt();

            while (value < 10 || value > 100) {
                System.out.println("Input out of range! Try again.");
                System.out.printf("%nInteger #%d: ", i + 1);
                value = input.nextInt();
            }
            tenValues[i] = value;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i != j) {
                    if (tenValues[i] == tenValues[j]) {
                        tenValues[j] = -1;
                    }
                }
            }
        }

        for (int number : tenValues) {
            if (number != -1) {
                System.out.printf("%d ", number);
            }
        }
    }
}
