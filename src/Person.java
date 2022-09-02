import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import static Utils.Utils.*;

public class Person {

    public static void main(String[] args) throws IOException {
        /**
         * 28. В классе Person создать переменную yob (year of birth),
         * присвоить ей значение (любое, например, 1990) и вывести на печать
         * сообщение:
         *
         * “Если человек родился в 1990 году, то его возраст -
         * разница между 2022 и 1990”.
         *
         * Значение 1990 должно выводиться в виде переменной,
         * вы не должны его печатать цифрами.
         * Остальные слова вы должны распечатать в виде текста.
         */

        part(3);
        task(28);

        int yob = 2001;
        int currentYear = 2022;
        int diffInYear = currentYear - yob;
        String text1 = "Если человек родился в ";
        String text2 = " году, то его возраст составляет ";
        String dot = ".";
        String year;

        if (diffInYear % 10 == 1 && diffInYear !=11) {
            year = " год";
        } else if (diffInYear > 4 && diffInYear < 21) {
                year = " лет";
        } else {
            year = " года";
        }

            System.out.println(text1 + yob + text2 + diffInYear + year + dot);

        /**
         * 29. Присвойте новое значение переменной yob
         * и выведите на печать фразу:
         * “Если человек родился в … году, то его возраст 2 года назад -
         * разница между … и …”.
         */
        task(29);

        yob = 2009;
        diffInYear = currentYear - 2 - yob;
        text1 = "Если человек родился в ";
        text2 = " году, то его возраст 2 года назад составлял ";

        if (diffInYear % 10 == 1 && diffInYear !=11) {
            year = " год";
        } else if (diffInYear > 4 && diffInYear < 21) {
            year = " лет";
        } else {
            year = " года";
        }

        System.out.println(text1 + yob + text2 + diffInYear + year);
    }
}