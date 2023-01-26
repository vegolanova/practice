import java.util.Scanner;

public class Ch3ex3_17 {
    public static void main(String[] args) {
       int totalMiles = 0;
       int totalGallons = 0;
       double milesPerGallon = 0;

       Scanner input = new Scanner(System.in);

       System.out.print("Input how many miles were driven in a trip or -1 to stop: ");
       int inputVal = input.nextInt();

       while (inputVal != -1) {
           totalMiles = totalMiles + inputVal;
           int currentMiles = inputVal;

           System.out.print("Input how many gallons were used in a trip or -1 to stop: ");
           inputVal = input.nextInt();
           int currentGallons = inputVal;
           totalGallons = totalGallons + inputVal;

           double milesPerGallonTrip = (double) currentMiles / currentGallons;
           System.out.printf("Miles per gallon for this trip: %.2f%n%n", milesPerGallonTrip);

           System.out.print("Input how many miles were driven in a trip or -1 to stop: ");
           inputVal = input.nextInt();
       }

       if (totalGallons != 0 && totalMiles != 0) {
           milesPerGallon = (double) totalMiles / totalGallons;

           System.out.printf("\nTotal average miles per gallon: %.2f", milesPerGallon);
       } else {
           System.out.print("\nNot enough values.");
       }
    }
}
