import java.util.Scanner;

public class Ch3ex3_39_1 {
    public static void main(String[] args) {
        int toEncrypt, encrypted, digit1, digit2, digit3, digit4, temp3, temp4;

        Scanner input = new Scanner(System.in);

        System.out.print("Input a 4-digit number to encrypt it: ");
        toEncrypt = input.nextInt();

        //pick each digit
        digit1 = toEncrypt / 1000;
        digit2 = (toEncrypt / 100) % 10;
        digit3 = (toEncrypt / 10) % 10;
        digit4 = toEncrypt % 10;

        //get the remainder after dividing (digitX + 7) by 10
        digit1 = (digit1 + 7) % 10;
        digit2 = (digit2 + 7) % 10;
        digit3 = (digit3 + 7) % 10;
        digit4 = (digit4 + 7) % 10;

        //swap 1st and 3d digits;
        temp3 = digit3;
        digit3 = digit1;
        digit1 = temp3;

        //swap 2nd and 4th digits;
        temp4 = digit4;
        digit4 = digit2;
        digit2 = temp4;

        encrypted = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;

        System.out.printf("%nYour input: %d%nEncrypted: %d", toEncrypt, encrypted);
    }
}
