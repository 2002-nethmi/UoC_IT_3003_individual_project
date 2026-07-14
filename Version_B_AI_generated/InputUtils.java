package Version_B_AI_generated;
import java.util.Scanner;
/**
 * Utility class for safe user input handling.
 */
public class InputUtils {
    private static Scanner sc = new Scanner(System.in);

    public static int readInt(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            System.out.print(prompt);
            sc.next();
        }
        int value = sc.nextInt();
        sc.nextLine(); // consume newline
        return value;
    }

    public static double readDouble(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            System.out.print(prompt);
            sc.next();
        }
        double value = sc.nextDouble();
        sc.nextLine(); // consume newline
        return value;
    }

    public static String readLine(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static void closeScanner() {
        sc.close();
    }
}

