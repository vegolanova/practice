/* OUTPUT

*     **********     **********     *
**     *********     *********     **
***     ********     ********     ***
****     *******     *******     ****
*****     ******     ******     *****
******     *****     *****     ******
*******     ****     ****     *******
********     ***     ***     ********
*********     **     **     *********
**********     *     *     **********

*/
public class Ch4ex4_22_v1 {
    public static void main(String[] args) {
        for (int n = 0; n < 10; n++) {       //the height of full output is 10

            //triangle 1
            for (int j = 0; j <= n; j++) {   //printing j stars on i row
                System.out.print("*");
                counter1++;

            }
            for (int k = 0; k < 5; k++) { //spaces to next triangle
                System.out.print(" ");
            }

            //triangle 2
            for (int j = 10; j > n; j--) {  //printing j stars on i row
                System.out.print("*");
            }


            for (int k = 0; k < 5; k++) {
                System.out.print(" ");
            }


            //triangle 3
            for (int j = 10; j > n; j--) {  //printing j stars on i row
                System.out.print("*");
            }


            for (int k = 0; k < 5; k++) {
                System.out.print(" ");
            }

            //triangle 4
            for (int k = 0; k <= n; k++) {   //printing k stars on i row
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
