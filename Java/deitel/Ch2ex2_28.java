import java.util.Scanner;

public class Ch2ex2_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the radius value: ");
        int r = input.nextInt();

        System.out.printf("Radius: %d%nDiameter: %d%nCircumference: %f%nArea: %f",
                r, 2 * r, 2 * Math.PI * r, Math.PI * r * r);
    }
}
