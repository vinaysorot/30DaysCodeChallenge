import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a No.:");
        int num = scanner.nextInt();
        System.out.println();

        if (num == 0) {
            System.out.println("0 is neither even nor odd no.");
        } else if (num % 2 == 0) {
            System.out.println("Number entered is a Even No...");
        } else {
            System.out.println("Number entered is a Odd No...");
        }
    }
}

