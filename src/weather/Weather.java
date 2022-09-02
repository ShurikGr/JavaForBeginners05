package weather;

import Utils.Utils;

import static Utils.Utils.*;

public class Weather {
    public static void main(String[] args) {
        /**
         * 30. В проекте JavaForBeginners05 создайте пакет weather.
         * Затем создайте необходимый класс, переменные, и выведите на печать
         * - текущую погоду
         * - погоду на завтра
         * в любом городе.
         * (Желательно использовать сайт https://openweathermap.org/ для поиска данных)
         */

        String bold = (char) 27 + "[1m";
        String head1 = bold + "ПРОГНОЗ ПОГОДЫ";
        String head2 = bold + "Данные предоставлены сайтом https://openweathermap.org/";
        String text1 = ANSI_GREEN + bold + "Температура в городе " + ANSI_RESET;
        String city = ANSI_RED + bold + "Limassol" + ANSI_RESET;
        String celsius = "\u2103";
        String enter = "\n";
        String space = " ";
        String header = bold + "           Температура днем       Температура ночью";
        String today = "Сегодня";
        String tomorrow = "Завтра";
        int dayTemperatureToday = 32;
        int nightTemperatureToday = 26;
        int dayTemperatureTomorrow = 31;
        int nightTemperatureTomorrow = 25;

        System.out.println(
                enter + head1 + enter + head2 + enter + enter + text1 + city + enter.repeat(2) + header + "" + enter +
                        today + space.repeat(12) + dayTemperatureToday + celsius + space.repeat(20) +
                        nightTemperatureToday + celsius + enter + tomorrow + space.repeat(13) + dayTemperatureTomorrow +
                        celsius + space.repeat(20) + nightTemperatureTomorrow + celsius
        );


    }
}