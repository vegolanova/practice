import java.util.Scanner;

public class Ch5ex5_20 {
    public static boolean isLeapYear(int year) {
        int lastTwoDigits = year % 1000;
        return lastTwoDigits % 4 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a year: ");
        int year = input.nextInt();

        if (isLeapYear(year)) {
            System.out.printf("The year %d is a leap year!", year);
        } else {
            System.out.printf("The year %d is NOT a leap year!", year);
        }
    }
}
