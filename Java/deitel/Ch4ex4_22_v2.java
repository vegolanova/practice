/* OUTPUT

(a)          (b)          (c)          (d)
*            **********   **********            *
**           *********     *********           **
***          ********       ********          ***
****         *******         *******         ****
*****        ******           ******        *****
******       *****             *****       ******
*******      ****               ****      *******
********     ***                 ***     ********
*********    **                   **    *********
**********   *                     *   **********

*/

public class Ch4ex4_22_v2 {
    public static void main(String[] args) {
        System.out.printf("%s%13s%13s%13s%n", "(a)", "(b)", "(c)", "(d)");
        for (int n = 0; n < 10; n++) {
            
            //triangle 1
            for (int i = 0; i <= n; i++) {
                System.out.print("*");
            }

            for (int j = 12 - n; j > 0; j--) {
                System.out.print(" ");
            }

            //triangle 2
            for (int i = 10; i > n; i--) {
                System.out.print("*");
            }

            for (int j = 0; j < n + 3; j++) {
                System.out.print(" ");
            }

            //triangle 3
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }

            for (int i = 10 - n; i > 0; i--) {
                System.out.print("*");
            }

            //triangle 4
            for (int j = 12; j > n; j--) {
                System.out.print(" ");
            }

            for (int i = 0; i <= n; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
