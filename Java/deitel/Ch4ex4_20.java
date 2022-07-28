import java.util.Scanner;

public class Ch4ex4_20 {
    public static void main(String[] args) {
        double pi = 4, add = 0;
        int terms;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of terms to calculate pi: ");
        terms = input.nextInt();

        for (int i = 1; i < terms; i++) {

            if (i % 2 == 1) {
                pi -= (4 / (3 + add));
                add += 2;
            }

            //(4/(2*n - 1))

            if (i % 2 == 0) {
                pi += (4 / (3 + add));
                add += 2;
            }
        }

        System.out.printf("Number of terms: %d%nPi = %f", terms, pi);
        //to get pi = 3.141590 you need 350000 terms
    }
}
