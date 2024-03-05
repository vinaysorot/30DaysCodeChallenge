import java.util.Scanner;

public class JourneyTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the 30-day journey tracker!");
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("Please share a brief message about your 30-day journey and what you've learned: ");
        String experience = scanner.nextLine();

        String farewellMessage = generateFarewellMessage(name, experience);

        System.out.println("\n=== Personalized Farewell Message ===");
        System.out.println(farewellMessage);
    }

    private static String generateFarewellMessage(String name, String experience) {
        String farewellMessage = "Dear " + name + ",\n\n";
        farewellMessage += "Thank you for sharing your 30-day journey experience. It's truly inspiring to hear about what you've learned and accomplished. Your dedication and effort are commendable. As you move forward, remember that every day is an opportunity to grow and learn.\n\n";
        farewellMessage += "Wishing you continued success and fulfillment on your journey!\n\n";
        farewellMessage += "Best regards,\nThe Journey Tracker";
        return farewellMessage;
    }
}
