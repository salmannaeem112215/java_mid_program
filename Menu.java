import java.util.*;

public interface Menu {
    public void performAction(int action);

    public int displayMenu();

    public static void showSuccess(String val) {
        System.out.println(val + "Perform Successfully");
    }

    public static void showUnsuccess(String val) {
        System.out.println(val + "Not Performed");

    }

    public static int display(String name, String[] actions, int count) {
        int len = count;
        System.out.println("--------------------------------------------------------------");
        System.out.println("|           " + name);
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < actions.length; i++) {
            System.out.print("|");

            if (len < 10) {
                System.out.print(" " + len);
            } else {
                System.out.print(" " + len);
            }

            System.out.print(" | " + actions[i] + "\n");
            len++;

        }
        System.out.println("--------------------------------------------------------------");
        return len;
    }

    // public static int getIntegerInputWithRange(int min, int max) {
    // Scanner scanner = new Scanner(System.in);
    // int userInt = 0;
    // boolean validInput = false;

    // do {
    // System.out.print("Enter an integer within the range [" + min + ", " + max +
    // "]: ");
    // userInt = scanner.nextInt();

    // if (scanner.hasNextInt()) {
    // // userInt = scanner.nextInt();
    // if (userInt >= min && userInt <= max) {
    // validInput = true;
    // } else {
    // System.out.println("Please enter a number within the specified range.");
    // }
    // } else {
    // scanner.nextLine(); // Consume the invalid input
    // System.out.println("Invalid input. Please enter a valid integer.");
    // }
    // } while (!validInput);

    // scanner.close();
    // return userInt;
    // }

    // public static String getString(String message) {
    // Scanner scanner = new Scanner(System.in);
    // System.out.print(message);
    // String input = scanner.next();
    // scanner.close();
    // return input;
    // }
    static public Scanner scanner = new Scanner(System.in);

    public static int getIntegerInputWithRange(int min, int max) {
        int userInt = 0;
        boolean validInput = false;

        do {
            System.out.print("Enter an integer within the range [" + min + ", " + max + "]: ");
            userInt = scanner.nextInt();

            if (userInt >= min && userInt <= max) {
                validInput = true;
            } else {
                System.out.println("Please enter a number within the specified range.");
            }
        } while (!validInput);

        return userInt;
    }

    public static String getString(String message) {
        System.out.print(message);

        // Check if there is any more input available before calling scanner.next().
        if (scanner.hasNext()) {
            String input = scanner.next();
            return input;
        } else {
            // There is no more input available.
            System.out.println("No input found.");
            return "";
        }
    }

}
