import java.util.Scanner;

public class Ch5ex5_15 {
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the length of the 1st side: ");
        double side1 = input.nextDouble();

        System.out.print("Input the length of the 2nd side: ");
        double side2 = input.nextDouble();

        double hypotenuse = hypotenuse(side1, side2);

        System.out.printf("Hypotenuse size: %f", hypotenuse);
    }
}
