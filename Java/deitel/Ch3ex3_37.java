import java.util.Scanner;

public class Ch3ex3_37 {
    public static void main(String[] args) {
        int p1x, p1y, p2x, p2y;

        Scanner input = new Scanner(System.in);

        System.out.print("Input X coordinate of the 1st point: ");
        p1x = input.nextInt();

        System.out.print("Input Y coordinate of the 1st point: ");
        p1y = input.nextInt();

        System.out.print("Input X coordinate of the 2nd point: ");
        p2x = input.nextInt();

        System.out.print("Input Y coordinate of the 2nd point: ");
        p2y = input.nextInt();

        if (p1x == p2x) {
            System.out.printf("Line going through point (%d; %d) and point (%d; %d) " +
                    "is perpendicular to the X-axis.", p1x, p1y, p2x, p2y);

        } else if (p1y == p2y) {
            System.out.printf("Line going through point (%d; %d) and point (%d; %d) " +
                    "is perpendicular to the Y-axis.", p1x, p1y, p2x, p2y);

        } else {
            System.out.printf("Line going through point (%d; %d) and point (%d; %d)" +
                    " is not perpendicular to any axis.", p1x, p1y, p2x, p2y);
        }
    }
}
