import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ScoreManager {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Score Management System ---");
            System.out.println("1. Add Student Score");
            System.out.println("2. Display All Scores");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // បោសសម្អាត buffer

            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter score: ");
                int score = scanner.nextInt();
                studentScores.put(name, score);
                System.out.println("Added successfully!");
            }
            else if (choice == 2) {
                System.out.println("\n--- List of Student Scores ---");
                for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
                    System.out.println("Name: " + entry.getKey() + ", Score: " + entry.getValue());
                }
            }
            else if (choice == 3) {
                System.out.println("Exiting program...");
                break;
            }
            else {
                System.out.println("Invalid option! Please try again.");
            }
        }
        scanner.close();
    }
}