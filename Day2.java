import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;
        System.out.println("Please enter your Name and Age ");
        System.out.print("1. Name: ");
        name = scanner.nextLine();
        System.out.println();
        System.out.print("2. Age: ");
        age = scanner.nextInt();
        System.out.println();
        System.out.println("Thanks a lot for entering your Age: " + age);
        scanner.close();
    }
}

