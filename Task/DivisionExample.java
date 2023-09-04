public class DivisionExample {
    public static void main(String[] args) {
        int[] numbers = {9, 33, 0, 7, 2, 82, 77};

        for (int i = 0; i < numbers.length - 1; i++) {
            try {
                int result = divideWithExceptionHandling(numbers[i], numbers[i + 1]);
                System.out.println(numbers[i] + " / " + numbers[i + 1] + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero not allowed.");
            }
        }

        try {
            int result = divideWithExceptionHandling(numbers[numbers.length - 1], numbers[0]);
            System.out.println(numbers[numbers.length - 1] + " / " + numbers[0] + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed.");
        }
    }

    public static int divideWithExceptionHandling(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return dividend / divisor;
    }
}
