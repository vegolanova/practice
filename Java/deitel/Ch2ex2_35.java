public class Ch2ex2_35 {
    public static void main(String[] args) {
        int stonesQtyTotal = 2_300_000;
        long stoneWeightKg = 6_000_000_000L / stonesQtyTotal;
        int buildTimeYrs = 27;
        int daysInYear = 365;
        int hrsInDay = 24;
        int minsInHour = 60;

        int yearlyBuild = (int) ((stonesQtyTotal * stoneWeightKg) / buildTimeYrs);
        int dayBuild = (int) ((stonesQtyTotal * stoneWeightKg) / (buildTimeYrs * daysInYear));
        int hourBuild = (int) ((stonesQtyTotal * stoneWeightKg) / (buildTimeYrs * daysInYear * hrsInDay));
        int minuteBuild = (int) ((stonesQtyTotal * stoneWeightKg) / (buildTimeYrs * daysInYear * hrsInDay * minsInHour));

        System.out.printf("Estimated weight built each year: %d%n" +
                "Estimated weight built each day: %d%n" +
                "Estimated weight built each hour: %d%n" +
                "Estimated weight built each minute: %d%n",
                yearlyBuild, dayBuild, hourBuild, minuteBuild);
    }
}
