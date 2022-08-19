import java.util.Scanner;

public class Ch5ex5_28 {
    public static String sportsRecommender(int temperature) {
        String reply20to30 = "It's lovely weather for sports today!";
        String reply10to40 = "It's reasonable weather for sports today.";
        String replyElse = "Please exercise with care today, watch out for the weather!";

        if (temperature >= 20 && temperature <= 30) {
            return reply20to30;
        }

        if (temperature >= 10 && temperature <= 40) {
            return reply10to40;
        } else {
            return replyElse;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input today's temperature in Celsius: ");
        int temperature = input.nextInt();

        System.out.printf("%s", sportsRecommender(temperature));
    }
}
