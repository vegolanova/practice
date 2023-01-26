import java.util.Scanner;

public class Ch4ex4_11 {
    public static void main(String[] args) {
        int max, min, sum, temp;

        Scanner input = new Scanner(System.in);
        System.out.print("Input numbers or press <Ctrl> + d if done: ");
        temp = input.nextInt();
        max = temp;
        min = temp;

        while (input.hasNext()) {
            temp = input.nextInt();

            if (max < temp) {
                max = temp;
            }

            if (min > temp) {
                min = temp;
            }
        }

        sum = max + min;

        System.out.printf("Min: %d%nMax: %d%nSum: %d", min, max, sum);
    }
}
