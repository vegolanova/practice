import java.util.Scanner;

public class Ch3ex3_30 {
    public static void main(String[] args) {
        int base, i, j;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input base value (1 to 10): ");
        base = input.nextInt();

        for (i = 0; i < base; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        
        // same but using while statement
        while (i < base) {
        
            while (j < i) {
                System.out.print("*");
                j++;
            }

            System.out.print("\n");
            
            j = 0;
            i++;
        }
        
    }
}
