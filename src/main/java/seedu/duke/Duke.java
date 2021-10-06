package seedu.duke;

public class Duke {
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public static void main(String[] args) {
        Greet();
        Parser.programLogic();
        Bye();
    }

    private static void Bye() {
        System.out.println("\tYou did well today! Goodbye!");
    }

    private static void Greet() {
        String logo = "\n"
                + " .----------------.  .----------------.  .----------------.  .----------------. "
                + " .----------------.  .----------------. \n"
                + "| .--------------. || .--------------. || .--------------. || .--------------. |"
                + "| .--------------. || .--------------. |\n"
                + "| |     ______   | || |      __      | || |  _______     | || |  ________    | ||"
                + " |   _____      | || |     _____    | |\n"
                + "| |   .' ___  |  | || |     /  \\     | || | |_   __ \\    | || | |_   ___ `.  | ||"
                + " |  |_   _|     | || |    |_   _|   | |\n"
                + "| |  / .'   \\_|  | || |    / /\\ \\    | || |   | |__) |   | || |   | |   `. \\ |"
                + " || |    | |       | || |      | |     | |\n"
                + "| |  | |         | || |   / ____ \\   | || |   |  __ /    | || |   | |    | | | ||"
                + " |    | |   _   | || |      | |     | |\n"
                + "| |  \\ `.___.'\\  | || | _/ /    \\ \\_ | || |  _| |  \\ \\_  | || |  _| |___.' "
                + "/ | || |   _| |__/ |  | || |     _| |_    | |\n"
                + "| |   `._____.'  | || ||____|  |____|| || | |____| |___| | || | |________.'  | || "
                + "|  |________|  | || |    |_____|   | |\n"
                + "| |              | || |              | || |              | || |              | || "
                + "|              | || |              | |\n"
                + "| '--------------' || '--------------' || '--------------' || '--------------' |"
                + "| '--------------' || '--------------' |\n"
                + " '----------------'  '----------------'  '----------------'  '----------------' "
                + " '----------------'  '----------------' \n";
        System.out.println("Welcome to\n" + logo);
        System.out.println("Let's get started!");
    }
}
