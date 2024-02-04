public class Day4 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Calculate the factorial of 5
        int result = factorial(5);

        System.out.println("Factorial of 5: " + result);
    }
}
