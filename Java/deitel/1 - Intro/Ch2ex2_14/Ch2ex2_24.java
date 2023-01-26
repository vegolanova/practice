import java.util.Scanner;

public class Ch2ex2_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input 1st integer: ");
        int num1 = input.nextInt();

        System.out.print("Input 2nd integer: ");
        int num2 = input.nextInt();

        System.out.print("Input 3d integer: ");
        int num3 = input.nextInt();

        System.out.print("Input 4th integer: ");
        int num4 = input.nextInt();

        System.out.print("Input 5th integer: ");
        int num5 = input.nextInt();

        int biggest = num1;
        int smallest = num1;

        if (num2 > biggest) {
            biggest = num2;
        }

        if (num3 > biggest) {
            biggest = num3;
        }

        if (num4 > biggest) {
            biggest = num4;
        }

        if (num5 > biggest) {
            biggest = num5;
        }

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        if (num4 < smallest) {
            smallest = num4;
        }

        if (num5 < smallest) {
            smallest = num5;
        }

        System.out.printf("Your input: %d, %d, %d, %d, %d%nBiggest: %d%nSmallest: %d",
                num1, num2, num3, num4, num5, biggest, smallest);
    }
}
