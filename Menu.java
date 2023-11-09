import java.util.*;

enum DisplayType {
    start, end, mid, whole
};

public interface Menu {
    public void performAction(int action);

    public int displayMenu();

    public static void showSuccess(String val) {
        System.out.println(val + "Perform Successfully");
    }

    public static void showUnsuccess(String val) {
        System.out.println(val + "Not Performed");

    }

    private static int displayMenu(String name, String[] actions, int count, boolean showStart, boolean showEnd) {
        System.err.println("SHOW START" + showStart + "  Show End" + showEnd);
        int len = count;
        if (count > 0 || showStart) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("|           " + name);
            System.out.println("--------------------------------------------------------------");
            System.out.println("| -1| Go Back \\ Quit ");
        }

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
        if (showEnd) {

            System.out.println("--------------------------------------------------------------");
        }
        return len;
    }

    public static int display(String name, String[] actions, int count, DisplayType displayType) {
        if (displayType == DisplayType.start) {
            return displayMenu(name, actions, count, true, false);

        } else if (displayType == DisplayType.mid) {
            return displayMenu(name, actions, count, false, false);

        } else if (displayType == DisplayType.end) {
            return displayMenu(name, actions, count, false, true);

        } else if (displayType == DisplayType.whole) {
            return displayMenu(name, actions, count, true, true);
        }
        return 0;

    }

    public static int display(String name, String[] actions, int count) {
        return displayMenu(name, actions, count, true, true);

    }

    public static int displayStart(String name, String[] actions, int count) {
        return displayMenu(name, actions, count, true, false);
    }

    public static int displayEnd(String name, String[] actions, int count) {
        return displayMenu(name, actions, count, false, true);
    }

    public static int displayCenter(String name, String[] actions, int count) {
        return displayMenu(name, actions, count, false, false);
    }

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

    public static void sleep(int miliseconds) {
        try {
            Thread.sleep(miliseconds); // Pause the current thread for 500 milliseconds.
        } catch (InterruptedException e) {
            // Handle the InterruptedException exception.
        }
    }
}
