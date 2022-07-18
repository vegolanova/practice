public  class Ch2ex2_31 {
    public static void main(String[] args) {
        System.out.println("number\tsquare\tcube");
        int counter = 0;
        while (counter <= 10) {
            System.out.printf("%d\t\t%d\t\t%d%n",
                    counter, counter * counter, counter * counter * counter);
            counter++;
        }
    }
}
