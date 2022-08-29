import java.util.Scanner;

public class Ch5ex5_32 {
    private static double twoPointDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return distance;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Calculate the distance between two points.
                Input x-axis and y-axis coordinates for the points.""");

        System.out.print("Input values for the point (x1; y1).\nInput x1: ");
        double x1 = input.nextInt();
        System.out.print("Input y1: ");
        double y1 = input.nextInt();
        System.out.print("Input values for the point (x2; y2).\nInput x2: ");
        double x2 = input.nextInt();
        System.out.print("Input y2: ");
        double y2 = input.nextInt();

        System.out.printf("The distance between points (%.1f; %.1f) and (%.1f; %.1f): %f.",
                x1, y1, x2, y2, twoPointDistance(x1, y1, x2, y2));
    }
}
