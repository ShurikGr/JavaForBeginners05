package Utils;

public class Utils {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static int number = 1;
    public static int number1 = 1;

    public static void task() {
        System.out.println();
        System.out.println(ANSI_PURPLE + "—".repeat(10)
                + " [ Task " + number + " ] " + "—".repeat(10) + ANSI_RESET);
        System.out.println();
        number++;
    }

    public static void task(int number) {
        System.out.println();
        System.out.println(ANSI_PURPLE + "—".repeat(10)
                + " [ Task " + number + " ] " + "—".repeat(10) + ANSI_RESET);
        System.out.println();
        number++;
    }

    public static void part() {
        System.out.println();
        System.out.print(ANSI_CYAN + "—".repeat(10) + " [ Part " + number1 + " ] "
                + "—".repeat(10) + ANSI_RESET);
        number1++;
    }

    public static void part(int number) {
        System.out.println();
        System.out.print(ANSI_CYAN + "—".repeat(10) + " [ Part " + number + " ] "
                + "—".repeat(10) + ANSI_RESET);
        number1++;
    }

}
