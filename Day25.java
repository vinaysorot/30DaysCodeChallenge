import java.util.Scanner; // Add this line for taking user input

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);
        int array[] = new int[5];
        int arraySize = scanner.nextInt(); // Taking user input
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt(); // Taking user input
        }
        int output = sum(arraySize, array);
        System.out.println(output);
    }

    public static int sum(int n, int array[]) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return array[0];
        }
        if (n > 1) {
            int k = 0;
            k = array[0] + sum(n - 1, array + 1);
            return k;
        }
        return 0;
    }
}
