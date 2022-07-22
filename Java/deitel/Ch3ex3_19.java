import java.util.Scanner;

public class Ch3ex3_19 {
    public static void main(String[] args) {
        double totalSalary, baseSalary = 200.0, totalGrossSalary = 0.0, grossPerCent;

        Scanner input = new Scanner(System.in);

        System.out.print("Input gross sales or -1 to calculate total salary: ");
        double grossSales = input.nextDouble();

        if (grossSales >= -1) {
            while (grossSales != -1) {
                grossPerCent = 0.09 * grossSales;
                totalGrossSalary += grossPerCent;

                System.out.print("Input gross sales or -1 to calculate total salary: ");
                grossSales = input.nextDouble();
            }

            totalSalary = baseSalary + totalGrossSalary;
            System.out.printf("Total earnings in a week: %.2f", totalSalary);

        } else {
            System.out.print("Wrong input.\n");
        }
    }
}
