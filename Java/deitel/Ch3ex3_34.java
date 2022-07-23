import java.util.Scanner;

public class Ch3ex3_34 {
    public static void main(String[] args) {
        int limit, counting = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Input desired threshold: ");
        limit = input.nextInt();

        while (counting <= limit) {
            System.out.print("Input an integer: ");
            counting += input.nextInt();
        }

        System.out.printf("%nWe reached the limit!%n%nSo far:%nLimit: %d%nWhat we got: %d",
                limit, counting);
    }
}
