//  Label the elements of a five-by-six two-dimensional array table to indicate the order in
//  which they’re set to zero by the following program segment:
//        for(int col=0;col< 6;col++)
//        {
//        for(int row=0;row< 5;row++)
//        {
//        table[row][col]=0;
//        }
//        }
public class Ch6ex6_13 {
    public static void main(String[] args) {
        int[][] array = new int[5][6];
        int counter = 1;

        for (int col = 0; col < 6; col++) {
            for (int row = 0; row < 5; row++) {
                array[row][col] = counter++;

            }
        }

        for (int[] row : array) {
            for (int element : row) {
                System.out.printf("%-4d", element);
            }
            System.out.println();
        }
    }
}
