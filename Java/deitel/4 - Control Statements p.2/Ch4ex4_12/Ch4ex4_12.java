public class Ch4ex4_12 {
    public static void main(String[] args) {
        int counter = 1, sum = 0;

        while (counter <= 30) {
            if (counter % 3 == 0) {
                sum += counter;
            }
            counter++;
        }

        System.out.printf("Sum of integers divisible by 3 in range [1;30]: %d", sum);
    }
}
