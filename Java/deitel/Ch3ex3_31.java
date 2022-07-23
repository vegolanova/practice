import java.util.Scanner;

public class Ch3ex3_31 {
    public static void main(String[] args) {
        int number, n1, n2, n3, n4, n5;

        Scanner input = new Scanner(System.in);
        System.out.print("Input a five-digit number: ");
        number = input.nextInt();

        n1 = number / 10000;
        n2 = (number / 1000) % 10;
        n3 = (number / 100) % 10;
        n4 = (number / 10)  % 10;
        n5 = number % 10;

        if (n1 == n5 && n2 == n4) {
            System.out.printf("Number %d is a palindrome!", number);
        } else {
            System.out.printf("Number %d is not a palindrome!", number);
        }
    }
}
