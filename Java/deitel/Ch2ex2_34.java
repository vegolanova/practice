public class Ch2ex2_34 {
    public static void main(String[] args) {
        long worldPopulation = 7_960_000_000L;
        double growthRatePercent = 1.05; //as of 2020
        int years = 1;

        System.out.printf("World population as of 2022: %d%nGrowth rate as of 2020: %f%n%n", worldPopulation, growthRatePercent);

        while (years <= 5) {
            long estPopulation = (long) (worldPopulation * Math.pow((1 + (growthRatePercent / 100)), years));
            System.out.printf("World population after %d year: %d%n", years, estPopulation);
            years++;
       }
    }
}
