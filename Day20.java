import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Toggle the case of each character
        StringBuilder toggledString = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (Character.isLowerCase(c)) {
                toggledString.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                toggledString.append(Character.toLowerCase(c));
            } else {
                toggledString.append(c);
            }
        }

        // Output the result
        System.out.println("Toggled case string: " + toggledString.toString());

        scanner.close();
    }
}
