public class Ch3ex3_33 {
    public static void main(String[] args) {
        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;
        int qty = 8;

        while (counter < 4) {

            while (counter1 < 8) {
                System.out.print("* ");
                counter1++;
            }

            System.out.println();

            while (counter2 < 8) {
                System.out.print(" *");
                counter2++;
            }
            
            System.out.println();

            counter1 = 0;
            counter2 = 0;
            counter++;
        }
    }
}
