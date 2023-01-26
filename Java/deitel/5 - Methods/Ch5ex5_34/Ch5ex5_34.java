public class Ch5ex5_34 {
    private static String decimalToBinary(int num10) {
        StringBuilder converted = new StringBuilder();
        int num2;

        while (num10 != 0) {
            num2 = num10 % 2;
            num10 = num10 / 2;
            converted.append(num2);
        }
        return converted.reverse().toString();
    }

    private static String decimalToOctal(int num10) {
        StringBuilder converted = new StringBuilder();
        int num8;

        while (num10 != 0) {
            num8 = num10 % 8;
            num10 = num10 / 8;
            converted.append(num8);
        }
        return converted.reverse().toString();
    }

    private static String decimalToHexadecimal(int num10) {
        StringBuilder converted = new StringBuilder();
        int num16;

        while (num10 != 0) {
            num16 = num10 % 16;
            num10 = num10 / 16;

            switch (num16) {
                case 10 -> converted.append("A");
                case 11 -> converted.append("B");
                case 12 -> converted.append("C");
                case 13 -> converted.append("D");
                case 14 -> converted.append("E");
                case 15 -> converted.append("F");
                default -> converted.append(num16);
            }
        }
        return converted.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%s%n", "DECIMAL", "BINARY", "OCTAL", "HEXADECIMAL");
        for (int i = 1; i <= 256; i++) {
            System.out.printf("%-10d%-10s%-10s%s%n", i, decimalToBinary(i), decimalToOctal(i), decimalToHexadecimal(i));
        }
    }
}

