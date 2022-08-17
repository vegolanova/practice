public class Ch5ex5_24 {
    public static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int sum = 1;

        for (int i = 1; i < 1000; i++) {
            if (isPerfect(i)) {
                System.out.printf("Number %d is a perfect number!%nProof:%n", i);
                System.out.print("Factors and its sum: 1");

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        System.out.printf(" + %d", j);
                        sum += j;
                    }
                }

                System.out.printf(" = %d%n%n", sum);

                sum = 1;
            }
        }
    }
}
