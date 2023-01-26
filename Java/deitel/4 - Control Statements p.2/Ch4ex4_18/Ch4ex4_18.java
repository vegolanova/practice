public class Welcome1 {
    public static void main(String[] args) {
        int principal = 100000;
        int hryvni, kopiyku;

        double rate = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; ++year) {
            int amount = (int) (principal * Math.pow(1.0 + rate, year));

            hryvni = amount / 100;
            kopiyku = amount % 100;
            
            System.out.printf("%4d%20d,%d%n", year, hryvni, kopiyku);
        }
    }
}
