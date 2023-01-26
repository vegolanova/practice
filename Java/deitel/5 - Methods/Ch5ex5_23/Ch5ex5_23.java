import java.util.Scanner;

public class Ch5ex5_23 {
    public static boolean isPalindrome(String sequence) {
        int len = sequence.length();

        if (len % 2 != 0) {
            int middleChar = (len - 1) / 2;
            String part1 = sequence.substring(0, middleChar);
            String part2 = sequence.substring(middleChar + 1);
            part2 = new StringBuilder(part2).reverse().toString();

            return part1.equals(part2);

        } else {
            String part1 = sequence.substring(0, len / 2);
            String part2 = sequence.substring(len / 2);
            part2 = new StringBuilder(part2).reverse().toString();

            return part1.equals(part2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a sequence of integers: ");
        String sequence = input.nextLine();

        if (isPalindrome(sequence)) {
            System.out.printf("Sequence %s is a palindrome!", sequence);
        } else {
            System.out.printf("Sequence %s is NOT a palindrome!", sequence);
        }
    }
}
