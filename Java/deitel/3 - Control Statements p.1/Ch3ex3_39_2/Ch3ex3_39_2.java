import java.util.Scanner;

public class Ch3ex3_39_2 {
    public static void main(String[] args) {
        int toDecrypt, decrypted, digit1, digit2, digit3, digit4, temp1, temp2;
        //2609 ==> 9376 ==> 7693
        Scanner input = new Scanner(System.in);

        System.out.print("Input a 4-digit number to decrypt: ");
        toDecrypt = input.nextInt();

        digit1 = toDecrypt / 1000;
        digit2 = (toDecrypt / 100) % 10;
        digit3 = (toDecrypt / 10) % 10;
        digit4 = toDecrypt % 10;

        temp2 = digit2;
        digit2 = digit4;
        digit4 = temp2;

        temp1 = digit1;
        digit1 = digit3;
        digit3 = temp1;

        if (digit1 >= 7) {
            digit1 = digit1 + 10 - 7;
            digit1 = digit1 % 10;

        } else {
            digit1 = digit1 + 10 - 7;
        }

        if (digit2 >= 7) {
            digit2 = digit2 + 10 - 7;
            digit2 = digit2 % 10;

        } else {
            digit2 = digit2 + 10 - 7;
        }

        if (digit3 >= 7) {
            digit3 = digit3 + 10 - 7;
            digit3 = digit3 % 10;

        } else {
            digit3 = digit3 + 10 - 7;
        }

        if (digit4 >= 7) {
            digit4 = digit4 + 10 - 7;
            digit4 = digit4 % 10;

        } else {
            digit4 = digit4 + 10 - 7;
        }

        decrypted = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;

        System.out.printf("%nEncrypted: %d%nDecrypted: %d", toDecrypt, decrypted);
    }
}
