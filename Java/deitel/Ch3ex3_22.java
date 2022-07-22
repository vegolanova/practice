public class Ch3ex3_22 {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("N\t\tN^2\t\tN^3\t\tN^4");

        while (i < 6) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d%n", i, i * i, i * i * i, i * i * i * i);

            i++;
        }
    }
}
