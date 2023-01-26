public class Ch4ex4_13 {
    public static void main(String[] args) {
        long sum = 0;
        int counter = 1, n;

        System.out.printf("%s%10s%n", "n", "sum");

        while (counter <= 100) {
            sum += counter;
            System.out.printf("%d%10d%n", counter, sum);

            counter++;
        }
    }
}
