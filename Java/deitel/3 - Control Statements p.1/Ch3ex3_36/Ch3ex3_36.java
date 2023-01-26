import java.util.Scanner;

public class Ch3ex3_36 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Input first integer: ");
        num1 = input.nextInt();

        System.out.print("Input second integer: ");
        num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("0");

        } else if (num1 > num2) {
            System.out.println("1");

        } else {
            System.out.println("-1");
        }
    }
}
