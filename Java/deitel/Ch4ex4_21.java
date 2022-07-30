public class Ch4ex4_21 {
    public static void main(String[] args) {
        int side1, side2, hypotenuse;

        System.out.printf("%s%10s%20s%n",
                "side 1", "side 2", "hypotenuse");

        for (side1 = 1; side1 <= 500; side1++) {
            for (side2 = 1; side2 <= 500; side2++) {
                for (hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
                    if (Math.pow(hypotenuse, 2) == Math.pow(side1, 2) + Math.pow(side2, 2)) {
                        System.out.printf("%d%10d%20d%n", side1, side2, hypotenuse);
                    }
                }
            }
        }
    }
}
