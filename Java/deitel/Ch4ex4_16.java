import java.util.Scanner;

public class Ch4ex4_16 {
    public static void main(String[] args) {
        //implementation is stupid cuz arrays haven't been talked about yet
        //so kinda have to use only what has already been introduced in the book

        int num1 = 0, num2 = 0, num3 = 0, num4 = 0 , num5 = 0, numQty = 0;

        Scanner input = new Scanner(System.in);

        while (numQty != 1) {
            System.out.print("Input 1st integer in range [1;30]: ");
            num1 = input.nextInt();

            if (num1 < 1 || num1 > 30) {
                System.out.println("Integer out of range [1;30]! Input again.");
            } else {
                numQty++;
            }
        }

        numQty = 0;

        while (numQty != 1) {
            System.out.print("Input 2nd integer in range [1;30]: ");
            num2 = input.nextInt();

            if (num2 < 1 || num2 > 30) {
                System.out.println("Integer out of range [1;30]! Input again.");
            } else {
                numQty++;
            }
        }

        numQty = 0;

        while (numQty != 1) {
            System.out.print("Input 3d integer in range [1;30]: ");
            num3 = input.nextInt();

            if (num3 < 1 || num3 > 30) {
                System.out.println("Integer out of range [1;30]! Input again.");

            } else {
                numQty++;
            }
        }

        numQty = 0;

        while (numQty != 1) {
            System.out.print("Input 4th integer in range [1;30]: ");
            num4 = input.nextInt();

            if (num4 < 1 || num4 > 30) {
                System.out.println("Integer out of range [1;30]! Input again.");

            } else {
                numQty++;
            }
        }

        numQty = 0;

        while (numQty != 1) {
            System.out.print("Input 5th integer in range [1;30]: ");
            num5 = input.nextInt();

            if (num5 < 1 || num5 > 30) {
                System.out.println("Integer out of range [1;30]! Input again.");

            } else {
                numQty++;
            }
        }

        System.out.println("\nBar charts: ");

        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < num5; i++) {
            System.out.print("*");
        }
    }
}
