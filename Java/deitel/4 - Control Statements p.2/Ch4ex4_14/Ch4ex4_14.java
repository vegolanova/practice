public class Ch4ex4_14 {
    public static void main(String[] args) {
        double principal = 1000.0, newAmount = 0.0;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 5; year++) {
            for (double rate = 0.05; rate <= 0.1; rate++) {
                principal += principal * rate;
                newAmount = principal * Math.pow(1 + rate, year);

                System.out.printf("%2d%,17.2f%n", year, newAmount);
            }
        }
    }
}
