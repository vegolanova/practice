import java.util.Scanner;

public class Ch5ex5_21 {
    public static String fullStop(String str) {
        if (!str.endsWith(".")) {
            return str.concat(".");
        } else {
            return str;
        }
    }

    public static String capitalize(String str) {
        String firstLetter = str.substring(0, 1).toUpperCase();
        return firstLetter.concat(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a string to beautify: ");
        String str = input.nextLine();

        System.out.printf("Your beautified string:%n%s", fullStop(capitalize(str)));
    }
}
