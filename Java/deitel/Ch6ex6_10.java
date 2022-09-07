import java.util.Scanner;

public class Ch6ex6_10 {
    public static void main(String[] args) {
        int[] pixelValues = new int[10];
        int[] quantizedPixels = new int[10];
        Scanner input = new Scanner(System.in);
        int pixel;

        for (int i = 0; i < 10; i++) {
            System.out.print("Please input the pixels' values one by one: ");
            pixel = input.nextInt();

            while (pixel < 0 || pixel > 255) {
                System.out.println("Wrong value! Try again.");
                System.out.print("Please input the pixels' values one by one: ");
                pixel = input.nextInt();
            }

            pixelValues[i] = pixel;

            if (pixel <= 20) {
                quantizedPixels[i] = 10;
            } else if (pixel <= 40) {
                quantizedPixels[i] = 30;
            } else if (pixel <= 60) {
                quantizedPixels[i] = 30;
            } else if (pixel <= 80) {
                quantizedPixels[i] = 50;
            } else if (pixel <= 100) {
                quantizedPixels[i] = 70;
            } else if (pixel <= 120) {
                quantizedPixels[i] = 90;
            } else if (pixel <= 140) {
                quantizedPixels[i] = 110;
            } else if (pixel <= 160) {
                quantizedPixels[i] = 130;
            } else if (pixel <= 180) {
                quantizedPixels[i] = 150;
            } else {
                quantizedPixels[i] = 190;
            }
        }

        System.out.print("Initial pixels: ");
        for (int p : pixelValues) {
            System.out.printf("%d ", p);
        }

        System.out.print("\nQuantized pixels: ");
        for (int p : quantizedPixels) {
            System.out.printf("%d ", p);
        }
    }
}
