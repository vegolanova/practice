import java.security.SecureRandom;
import java.util.Scanner;

public class Ch5ex5_39 {
    enum ProblemTypes {ADD, SUB, MUL, DIV, MIX, ERROR}

    private static ProblemTypes typeChoice() {
        Scanner input = new Scanner(System.in);
        ProblemTypes problemTypeChoice;
        System.out.print("""
                                
                Choose a type of the problems.
                Input 1 for ADDITION.
                Input 2 for SUBTRACTION.
                Input 3 for MULTIPLICATION.
                Input 4 for DIVISION.
                Input 5 for a MIX of all types of problems mentioned above.
                YOUR CHOICE:\s""");
        int userChoice = input.nextInt();


        if (userChoice == 1) {
            problemTypeChoice = ProblemTypes.ADD;
        } else if (userChoice == 2) {
            problemTypeChoice = ProblemTypes.SUB;
        } else if (userChoice == 3) {
            problemTypeChoice = ProblemTypes.MUL;
        } else if (userChoice == 4) {
            problemTypeChoice = ProblemTypes.DIV;
        } else if (userChoice == 5) {
            problemTypeChoice = ProblemTypes.MIX;
        } else {
            System.out.println("Wrong input. Try again.\n");
            problemTypeChoice = typeChoice();
        }

        return problemTypeChoice;
    }

    enum DifficultyLevels {L1, L2, ERROR}

    private static DifficultyLevels levelChoice() {
        Scanner input = new Scanner(System.in);
        DifficultyLevels difficultyLvlChoice;
        System.out.print("""
                                
                Choose a difficulty level.
                Input 1 for level 1 (single-digit numbers multiplication.)
                Input 2 for level 2(two-digit numbers multiplication.
                YOUR CHOICE:\s""");
        int userChoice = input.nextInt();

        if (userChoice == 1) {
            difficultyLvlChoice = DifficultyLevels.L1;
        } else if (userChoice == 2) {
            difficultyLvlChoice = DifficultyLevels.L2;
        } else {
            System.out.println("Wrong input. Try again.\n");
            difficultyLvlChoice = levelChoice();
        }
        return difficultyLvlChoice;
    }

    private static int questionGenerator1(ProblemTypes type) {
        SecureRandom random = new SecureRandom();
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        String add = "plus", sub = "minus", mul = "times", div = "divided by";

        if (type == ProblemTypes.ADD) {
            System.out.printf("%nHow much is %d %s %d?%n", num1, add, num2);
            return num1 + num2;
        } else if (type == ProblemTypes.SUB) {
            System.out.printf("%nHow much is %d %s %d?%n", num1, sub, num2);
            return num1 - num2;
        } else if (type == ProblemTypes.MUL) {
            System.out.printf("%nHow much is %d %s %d?%n", num1, mul, num2);
            return num1 * num2;
        } else if (type == ProblemTypes.DIV) {
            System.out.printf("%nHow much is %d %s %d?%n", num1, div, num2);
            return num1 / num2;
        } else {
            int randType = random.nextInt(4);
            if (randType == 0) {
                System.out.printf("%nHow much is %d %s %d?%n", num1, add, num2);
                return num1 + num2;
            } else if (randType == 1) {
                System.out.printf("%nHow much is %d %s %d?%n", num1, sub, num2);
                return num1 - num2;
            } else if (randType == 2) {
                System.out.printf("%nHow much is %d %s %d?%n", num1, mul, num2);
                return num1 * num2;
            } else {
                System.out.printf("%nHow much is %d %s %d?%n", num1, div, num2);
                return num1 / num2;
            }
        }
    }

    private static int questionGenerator2(ProblemTypes type) {
        SecureRandom random = new SecureRandom();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        String add = "plus", sub = "minus", mul = "times", div = "divided by";

        if (type == ProblemTypes.ADD) {
            System.out.printf("%nHow much is %d %s %d?%n", num1, add, num2);
            return num1 + num2;
        } else if (type == ProblemTypes.SUB) {
            System.out.printf("%nHow much is %d %s %d?%n", num1, sub, num2);
            return num1 - num2;
        } else if (type == ProblemTypes.MUL) {
            System.out.printf("%nHow much is %d %s %d?%n", num1, mul, num2);
            return num1 * num2;
        } else if (type == ProblemTypes.DIV) {
            System.out.printf("%nHow much is %d %s %d?%n", num1, div, num2);
            return num1 / num2;
        } else {
            int randType = random.nextInt(4);
            if (randType == 0) {
                System.out.printf("%nHow much is %d %s %d?%n", num1, add, num2);
                return num1 + num2;
            } else if (randType == 1) {
                System.out.printf("%nHow much is %d %s %d?%n", num1, sub, num2);
                return num1 - num2;
            } else if (randType == 2) {
                System.out.printf("%nHow much is %d %s %d?%n", num1, mul, num2);
                return num1 * num2;
            } else {
                System.out.printf("%nHow much is %d %s %d?%n", num1, div, num2);
                return num1 / num2;
            }
        }
    }

    private static void userResponse() {
        int attemptsCounter = 0, correctAttemptsCounter = 0;
        DifficultyLevels difficultyLvl = levelChoice();
        Scanner input = new Scanner(System.in);
        int answer;
        ProblemTypes typeChoice = typeChoice();

        while (attemptsCounter < 10) {

            if (difficultyLvl == DifficultyLevels.L1) {
                answer = questionGenerator1(typeChoice);
            } else {
                answer = questionGenerator2(typeChoice);
            }

            System.out.print("Your answer: ");
            int userAnswer = input.nextInt();
            SecureRandom random = new SecureRandom();
            int responseID = random.nextInt(4);

            while (userAnswer != answer) {
                switch (responseID) {
                    case 0 -> System.out.println("No. Please try again.");
                    case 1 -> System.out.println("Wrong. Try once more.");
                    case 2 -> System.out.println("Don't give up!");
                    case 3 -> System.out.println("No. Keep trying.");
                }
                responseID = random.nextInt(4);
                System.out.print("Your answer: ");
                userAnswer = input.nextInt();
                attemptsCounter++;

                if (attemptsCounter > 8) {
                    break;
                }
            }

            if (attemptsCounter > 8) {
                break;
            }

            responseID = random.nextInt(4);
            switch (responseID) {
                case 0 -> System.out.println("Very good!");
                case 1 -> System.out.println("Excellent!");
                case 2 -> System.out.println("Nice work!");
                case 3 -> System.out.println("Keep up the good work!");
            }
            attemptsCounter++;
            correctAttemptsCounter++;
        }
        performanceEvaluation(correctAttemptsCounter);
    }

    private static void performanceEvaluation(int correctAnswers) {
        int successRate = correctAnswers * 10;

        if (successRate >= 75) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        } else {
            System.out.println("Please ask your teacher for extra help.");
        }
    }

    public static void main(String[] args) {
        while (true) {
            userResponse();
        }
    }
}
