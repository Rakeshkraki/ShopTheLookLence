public class SumAndLastDivisibleBy3 {
    public static void main(String[] args) {
        String input = "The best 6 of 8 will get 9 points";
        String[] words = input.split("\\s+");

        int sum = 0;
        int lastDivisibleBy3 = 0;

        for (String word : words) {
            if (word.matches("\\d+")) {
                int number = Integer.parseInt(word);
                sum += number;
                if (number % 3 == 0) {
                    lastDivisibleBy3 = number;
                }
            }
        }

        System.out.println("Sum of numbers divisible by 3: " + sum);
        System.out.println("Last number divisible by 3: " + lastDivisibleBy3);
    }
}
