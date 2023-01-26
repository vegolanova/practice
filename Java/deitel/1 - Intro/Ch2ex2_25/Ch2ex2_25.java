import java.util.Scanner;

public class Ch2ex2_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int num = input.nextInt();

        if (num % 3 == 0) {
            System.out.printf("Number %d is divisible by 3", num);
        } else {
            System.out.printf("Number %d is not divisible by 3", num);
        }
    }
}
