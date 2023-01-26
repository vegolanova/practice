import java.util.Scanner;

public class Ch2ex2_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your weight in kg: ");
        int weightKg = input.nextInt();

        System.out.print("Input your height in cm: ");
        int heightCm = input.nextInt();
        double heightM = heightCm / 100.0;

        double bmi = weightKg / (heightM * heightM);

        System.out.printf("Your weight (kg): %d%nYour height (cm): %d%nYour BMI: %f%n", weightKg, heightCm, bmi);

        if (bmi < 18.5) {
            System.out.print("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.print("Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.print("Overweight");
        } else {
            System.out.print("Obesity");
        }
    }
}
