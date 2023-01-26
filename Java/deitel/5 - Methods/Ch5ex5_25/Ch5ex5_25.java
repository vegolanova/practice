public class Ch5ex5_25 {
    public static boolean isPrime(int num) {
        int factorCounter = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                factorCounter++;
            }
        }
        return factorCounter == 0;
    }

    public static void main(String[] args) {
        int primeCounter = 0;
        for (int i = 1; i < 10000; i++) {
            if (isPrime(i)) {
                primeCounter++;
                System.out.printf("Number %d is a prime number!%n", i);
            }
        }
        
        System.out.printf("%nTOTAL: %d prime numbers were found", primeCounter);
    }
}
