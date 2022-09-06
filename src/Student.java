public class Student {

    static final String LINE_STUDENT_M = "========== [УЧЕНИК] ===========";
    static final String LINE_STUDENT_F = "========== [УЧЕНИЦА] ===========";
    static final String LINE = "================================";
    static final String FIRST_NAME = "Имя: ";
    static final String LAST_NAME = "Фамилия: ";
    static final String AGE = "Возраст: ";
    static final String LEVEL = "Класс: ";
    static final String YEARS = " лет";
    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_BLUE = "\u001B[34m";
    static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {

        String firstName = "Вова";
        String lastName = "Сидоров";
        int level = 5;
        int yob = 10;

        System.out.println(
                ANSI_BLUE +
                        LINE_STUDENT_M + "\n" +
                        FIRST_NAME + firstName + " ".repeat(22) + "|\n" +
                        LAST_NAME + lastName + " ".repeat(15) + "|\n" +
                        AGE + yob + YEARS + " ".repeat(16) + "|\n" +
                        LEVEL + level + " ".repeat(23) + "|" + "\n" +
                        LINE +
                        ANSI_RESET
        );

        firstName = "Маша";
        lastName = "Семенова";
        level = 9;
        yob = 14;

        System.out.println(
                ANSI_PURPLE +
                        LINE_STUDENT_F + "\n" +
                        FIRST_NAME + firstName + " ".repeat(22) + "|\n" +
                        LAST_NAME + lastName + " ".repeat(14) + "|\n" +
                        AGE + yob + YEARS + " ".repeat(16) + "|\n" +
                        LEVEL + level + " ".repeat(23) + "|" + "\n" +
                        LINE +
                        ANSI_RESET
        );
    }
}