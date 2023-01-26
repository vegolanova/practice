import java.util.Scanner;

public class Ch3ex3_18 {
    public static void main(String[] args) {
        int accNumber = 0;
        double initBalance, totalCharges, totalCredits, creditLimit, newBalance;

        Scanner input = new Scanner(System.in);

        System.out.print("Create a customer.\nInput an account number or -1 to stop: ");
        accNumber = input.nextInt();

        while (accNumber != -1) {
            System.out.print("Input the balance at the beginning of the month: ");
            initBalance = input.nextInt();

            System.out.print("Input total of all items charged by the customer this month: ");
            totalCharges = input.nextInt();

            System.out.print("Input total of all credits applied to the customer’s account this month: ");
            totalCredits = input.nextInt();

            System.out.print("Input allowed credit limit: ");
            creditLimit = input.nextInt();

            newBalance = initBalance + totalCharges - totalCredits;

            if (newBalance > creditLimit) {
                System.out.printf("Customer %d: Credit limit exceeded%n%n", accNumber);
            }

            System.out.print("Create a customer.\nInput an account number or -1 to stop: ");
            accNumber = input.nextInt();
        }
    }
}
