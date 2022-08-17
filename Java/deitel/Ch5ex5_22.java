import java.util.Scanner;

public class Ch5ex5_22 {
    public static double toKelvin(int temperature) {
        return temperature + 273.15;
    }

    public static double toCelsius(int temperature) {
        return temperature - 273.15;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("""
                Print "celsius" to input temperature in celsius.
                Print "kelvin" to input temperature in kelvin.
                Your choice:\s""");

        String measureSystem = input.nextLine();

        if (measureSystem.toLowerCase().equals("celsius")) {
            System.out.print("Input temperature: ");
            int temperature = input.nextInt();

            System.out.printf("Temperature in celsius: %d%nTemperature in kelvin: %.0f",
                    temperature, toKelvin(temperature));
            
        } else if (measureSystem.toLowerCase().equals("kelvin")) {
            System.out.print("Input temperature: ");
            int temperature = input.nextInt();

            System.out.printf("Temperature in kelvin: %d%nTemperature in celsius: %.0f",
                    temperature, toCelsius(temperature));
            
        } else {
            System.out.println("Unrecognizable measurement system. Try again.");
        }
    }
}
