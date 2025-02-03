import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Collect user details
        System.out.print("Please enter your full name: ");
        String name = scanner.nextLine(); // Reads the user's name as a string

        System.out.print("Please enter your age (whole number): ");
        int age = scanner.nextInt(); // Reads the user's age as an integer

        System.out.print("Please enter your weight (in pounds): ");
        double weight = scanner.nextDouble(); // Reads the user's weight as a double

        System.out.print("Are you a smoker? (true/false): ");
        boolean isSmoker = scanner.nextBoolean(); // Reads the user's smoking status as a boolean

        // Display the collected information
        System.out.println("\n--- Medical Form ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " lbs");
        System.out.println("Smoker: " + isSmoker);

        // Close the scanner
        scanner.close();
    }
}
