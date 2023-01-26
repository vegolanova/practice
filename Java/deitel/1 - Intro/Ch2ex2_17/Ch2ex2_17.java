import java.util.Scanner;

public class Ch2ex2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input 1st integer: ");
        int num1 = input.nextInt();

        System.out.print("Input 2nd integer: ");
        int num2 = input.nextInt();

        System.out.print("Input 3d integer: ");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        int avg = (num1 + num2 + num3) / 3;
        int product = num1 * num2 * num3;
        int smallest = num1;
        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }
        
        System.out.printf("\nNumbers: %d, %d, and %d;%nSum: %d%nAverage: %d%n" +
                        "Product: %d%nSmallest: %d%nLargest: %d",
                num1, num2, num3, sum, avg, product, smallest, largest);
    }
}
