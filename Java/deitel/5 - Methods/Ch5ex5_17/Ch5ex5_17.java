import java.util.Scanner;

public class Ch5ex5_17 {
    public static boolean isDivisible(int num) {
        return num % 5 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Input 10 integers to determine whether they are divisible
                by 5.""");

        for (int counter = 0; counter < 10; counter++) {
            System.out.printf("%d integers to go!%n%nInput an integer: ", 10 - counter);

            int num = input.nextInt();

            if (isDivisible(num)) {
                System.out.printf("Integer %d is divisible by 5%n", num);
            } else {
                System.out.printf("Integer %d is NOT divisible by 5%n", num);
            }
        }
    }
}
