public class Ch3ex3_40 {
    public static void main(String[] args) {
        double growthRate = 0.011;
        double population = 7_900_000_000.0;
        double newPopulation, annualGrowth = 0.0;
        int counter = 1;

        System.out.print("YEAR\tEXPECTED POPULATION\t\t  ANNUAL GROWTH\n");

        while (counter <= 75) {
            annualGrowth = population * growthRate;
            newPopulation =  population + annualGrowth;
            population = newPopulation;

            System.out.printf("%d\t\t\t%.0f\t\t\t\t%.0f%n", counter, newPopulation, annualGrowth);

            counter++;
        }
    }
}
