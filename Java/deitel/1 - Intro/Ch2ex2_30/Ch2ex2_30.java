import java.util.Scanner;

public class Ch2ex2_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number of 5 digits (no spaces): ");
        int digits = input.nextInt();
        if (digits > 9999 && digits < 100000) {
            int digit1 = digits / 10000;
            int digit2 = (digits / 1000) % 10;
            int digit3 = (digits / 100) % 10;
            int digit4 = (digits / 10) % 10;
            int digit5 = digits % 10;
            
            System.out.printf("%d: %d %d %d %d %d",
                    digits, digit1, digit2, digit3, digit4, digit5);
        } else {
            System.out.print("Input out of range");
        }
    }
}
