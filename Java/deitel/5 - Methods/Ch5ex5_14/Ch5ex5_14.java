public class Ch5ex5_14 {
    public static int myFloor(double num) {
        int flooredNum = (int) num;

        if (flooredNum > num) {
            flooredNum -= 1;
        }

        return flooredNum;
    }

    public static int myCeil(double num) {
        int ceiledNum = (int) num;

        if (ceiledNum < num) {
            ceiledNum += 1;
        }

        return ceiledNum;
    }

    public static void main(String[] args) {
        double num1 = 32.87, num2 = -7.54;
        System.out.printf("Floored %f and %f: %d, %d%nCeiled %f and %f: %d, %d",
                num1, num2, myFloor(num1), myFloor(num2), num1, num2, myCeil(num1), myCeil(num2));
    }
}
