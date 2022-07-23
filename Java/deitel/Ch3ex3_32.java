import java.util.Scanner;

public class Ch3ex3_32 {
    public static void main(String[] args) {
        int binary, power = 1, decimal = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Input binary number: ");
        binary = input.nextInt();
        int savedBinary = binary;

        while (binary > 0) {
            decimal = decimal + (binary % 10) * power;

            binary /= 10;
            power *= 2;
        }
        System.out.printf("Binary number: %d%nDecimal number: %d", savedBinary, decimal);
    }
}
