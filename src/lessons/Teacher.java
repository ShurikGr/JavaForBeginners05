package lessons;

public class Teacher {

    final static String LINE_TEACHER = "========== [TEACHER] ===========";
    final static String LINE = "================================";

    public static void main(String[] args) {

        String firstName = "Maria";
        String midleName = "Ivanovna";
        String lastName = "Petrova";
        String subject = "Russian & Literature";
        int yob = 35;

        System.out.println(
                LINE_TEACHER + "\n" +
                "First name: " + firstName + "               |\n" +
                        "Midle name: " + midleName + "            |\n" +
                        "Last name: " + lastName + "              |\n" +
                        "Age: " + yob + " y.o.                    |\n" +
                        "Subject: " + subject + "   |" + "\n" +
                        LINE
        );

        firstName = "Ivan";
        midleName = "Petrovich";
        lastName = "Serebriakov";
        subject = "Mathematics";
        yob = 55;
        String ivanPetrovichSerebriakov =  LINE_TEACHER + "\n" +
                "First name: " + firstName + "                |\n" +
                "Midle name: " + midleName + "           |\n" +
                "Last name: " + lastName + "          |\n" +
                "Age: " + yob + " y.o.                    |\n" +
                "Subject: " + subject + "            |" + "\n" +
                LINE;

        System.out.println(ivanPetrovichSerebriakov);
    }
}