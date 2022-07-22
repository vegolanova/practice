import java.util.Scanner;

public class Ch3ex3_20 {
    public static void main(String[] args) {
        double taxUnder30k = 0.15, taxUp = 0.2, salary, totalTax;
        String nameSurname;
        int counter = 0;

        Scanner input = new Scanner(System.in);

        while (counter < 3) {
            System.out.print("Input citizen's name and surname: ");
            nameSurname = input.nextLine();

            System.out.printf("Input %s earnings in a year: ", nameSurname);
            salary = input.nextDouble();
            input.nextLine();

            if (salary < 30000) {
                totalTax = salary * taxUnder30k;

            } else {
                totalTax = salary * taxUp;
            }

            System.out.printf("Total tax for %s: %.2f%n%n", nameSurname, totalTax);

            counter++;
        }
    }
}
