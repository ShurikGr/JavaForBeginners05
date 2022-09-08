package homeWork;

import static Utils.Utils.*;

public class HW2 {

    public static final String ENTER = "\n";
    public static final String SPACE = " ";

    public static void main(String[] args) {
        /**
         * 4. Создать целочисленные переменные x, y, z и присвоить им любые
         * значения (на ваше усмотрение). Вывести значения переменных в столбик
         * Вывести значения переменных в строку
         * Вывести значения этих переменных так, чтобы было понятно,
         * какое значение к какой переменной относится.
         * Например, должно быть распечатано:
         * int x = 5;
         * или
         * y = 10;
         */
        part();
        task(4);

        int x = 5;
        int y = 10;
        int z = 15;

        subTask('A');
        System.out.println(x + "\n" + y + "\n" + z);

        subTask('B');
        System.out.println(x + " " + y + " " + z);

        subTask('C');

        String intX = "int x = ";
        String intY = "int y = ";
        String intZ = "int z = ";

        System.out.println(
                intX + x + ENTER
                        + intY + y + ENTER
                        + intZ + z
        );

        /**
         * 5. Используя конкатенацию, вывести в строку через запятую
         * значения переменных из задания 3
         * Пример вывода:
         * 5, 10, 15
         */
        task(5);

        String comma = ", ";

        System.out.println(x + comma + y + comma + z);

        /**
         * 6. Распечатать следующие выражения,
         * где вместо … будет выведен результат арифметической операции:
         * Sum of x and y = …
         * x * z = …
         * Разность переменных y и z = …
         */
        task(6);

        String text = "Sum of x and y = ";
        String text1 = "x * z = ";
        String text2 = "Разность переменных y и z = ";

        System.out.println(
                text + (x + y) + ENTER
                        + text1 + (x * y) + ENTER
                        + text2 + (y - z)
        );

        /**
         * 7. Создать переменные apple и student и присвоить им значения
         * 40 и 6 соотетственно. Распечатать выражение, где вместо …
         * - результаты математических вычислений:
         * Если … яблок поделить на … учеников, то каждый ученик получит
         * по … яблок(a), и … яблок(а) останется учителю.
         */
        task(7);

        int apple = 40;
        int student = 6;
        int division = apple / student;
        int reminder = apple % student;
        text = "Если ";
        text1 = " яблок поделить на ";
        text2 = " учеников, то каждый ученик получит по ";
        String text3 = " яблок(а), и ";
        String text4 = " яблок(а) останется учителю.";

        System.out.println(text + apple + text1 + student + text2 + division
                + text3 + reminder + text4);

        /**
         * 8. Распечатать выражение из задания 7 со значениями
         * 100 и 21 соответственно.
         */
        task(8);

        apple = 100;
        student = 21;
        division = apple / student;
        reminder = apple % student;

        System.out.println(text + apple + text1 + student + text2 + division
                + text3 + reminder + text4);

        /**
         * 9.  Решить с помощью переменных и математических вычислений
         * следующую задачу:
         * В школьную столовую привезли 6кг лимонов, яблок на 24 кг больше,
         * чем лимонов, а груш на 12кг меньше, чем яблок.
         * Сколько килограммов фруктов привезли в школьную столовую?
         */
        task(9);

        int lemons = 6;
        int apples = lemons + 24;
        int pears = apples  - 12;
        int fruits = lemons + apples + pears;
        text  = " килограмма фруктов привезли в школьную столовую.";

        System.out.println(fruits + text);

        /**
         * 10. Распечатать выражение с помощью переменных и вычислений:
         * У сороконожки заболели ножки:
         * 8 ноют, 5 гудят,
         * 7 хромают, 2 болят.
         * Помоги сороконожке
         * Посчитать здоровые ножки.
         * Ответ: …
         */
        task(10);

        text = "У сороконожки заболели ножки:\n" +
                "8 ноют, 5 гудят,\n" +
                "7 хромают, 2 болят.\n" +
                "Помоги сороконожке\n" +
                "Посчитать здоровые ножки.\n" +
                "Ответ: ";
        int a = 8;
        int b = 5;
        int c = 7;
        int d = 2;
        int healthyLegs = 40 - a - b - c - d;

        System.out.println(text + healthyLegs);

        /**
         * 11. Рассчитать с помощью математических операторов
         * и вывести на печать задачи и ответы:
         * Во сколько раз 35 больше, чем 7?
         * Во сколько раз 8 меньше, чем 48?
         * На сколько 54 больше, чем 6?
         */
        part();
        task(11);

        a = 35;
        b = 7;
        text = " больше чем ";
        text1 = " в ";
        text2 = " раз;";
        c = 8;
        d = 48;
        text3 = " меньше чем ";
        text4 = " на ";
        int e = 54;
        int f = 6;

        System.out.println(
                a + text + b + text1 + (a / b) + text2 + ENTER
                        + c + text3 + d + text1 + (d / c) + text2 + ENTER
                        + e + text + f + text4 + (e - f) + ".");

        /**
         * 12. Объяснить:
         * a. почему число 48 кратно 8
         * b. что оба числа - четные.
         * c. что числа 47 и 49 - нечетные.
         * d. только одно из всех чисел кратно 7
         */

        task(12);

        a = 48;
        b = 8;
        c = 47;
        d = 49;
        e = 2;

        subTask('A');
        text = "Число " + a + " кратно " + b + " потому что остаток от "
                + "деления равен " + (a % b) + ".";
        System.out.println(text);

        subTask('B');
        text = "Числo " + a + " четное, так как при делении на "
                + e + " остаток от деления равен " + a % e + ".";
        System.out.println(text);
        text = "Числo " + b + " четное, так как при делении на "
                + e + " остаток от деления равен " + b % e + ".";
        System.out.println(text);

        subTask('C');
        text = "Число " + c + " - нечетное, так как остаток от деления на "
                + e + " равен " + (c % e);
        System.out.println(text);
        text = "Число " + d + " - нечетное, так как остаток от деления на "
                + e + " равен " + (d % e);
        System.out.println(text);

        subTask('D');
        int number = 7;
        text = "Число " + a + " не кратно " + number + " так как остаток "
                + "от деления на " + e + " равен " + (a % number);
        System.out.println(text);
        text = "Число " + b + " не кратно " + number + " так как остаток "
                + "от деления на " + e + " равен " + (b % number);
        System.out.println(text);
        text = "Число " + c + " не кратно " + number + " так как остаток "
                + "от деления на " + e + " равен " + (c % number);
        System.out.println(text);
        text = "Число " + d + " кратно " + number + " так как остаток "
                + "от деления на " + e + " равен " + (d % number);
        System.out.println(text);

        /**
         * 13. Распечатать следующую таблицу,
         * где результат рассчитывается с помощью применения
         * арифметических и унарных операторов:
         */
        task(13);

        a = 10;
        b = -5;
        c = 100;
        d = 2;
        int k = 5;
        int l = 10;
        int m = 15;

        System.out.println(
            ANSI_BLUE + SPACE.repeat(8) + "+" + a
                    + SPACE.repeat(2) + b + SPACE.repeat(2) + "*" + c
                    + SPACE.repeat(2) + "/" + d + SPACE.repeat(2) + "%" + d
                    + SPACE.repeat(2) + "^" + d + SPACE.repeat(2) + "++"
                    + SPACE.repeat(2) + "--" + ANSI_RESET + ENTER + ANSI_RED
                    + "k = " + k + ANSI_RESET + SPACE.repeat(3) + (k + a)
                    + SPACE.repeat(3) + (k + b) + SPACE.repeat(3) + (k * c)
                    + SPACE.repeat(3) + (k / d) + SPACE.repeat(3) + (k % d)
                    + SPACE.repeat(3) + ((int)Math.pow(k, 2))  + SPACE.repeat(3)
                    + (++k) + SPACE.repeat(3) + (--k) + ENTER + ANSI_RED
                    + "l = " + l + ANSI_RESET + SPACE.repeat(2) + (l + a)
                    + SPACE.repeat(3) + (l + b) + SPACE.repeat(3) + (l * c)
                    + SPACE.repeat(2) + (l / d) + SPACE.repeat(3) + (l % d)
                    + SPACE.repeat(3) + ((int)Math.pow(l, 2))  + SPACE.repeat(2)
                    + (++l) + SPACE.repeat(2) + (--l) + ENTER + ANSI_RED
                    + "m = " + m + ANSI_RESET + SPACE.repeat(2) + (m + a)
                    + SPACE.repeat(2) + (m + b) + SPACE.repeat(3) + (m * c)
                    + SPACE.repeat(2) + (m / d) + SPACE.repeat(3) + (m % d)
                    + SPACE.repeat(3) + ((int)Math.pow(m, 2))  + SPACE.repeat(2)
                    + (++m) + SPACE.repeat(2) + (--m)
        );

        /**
         * 14.  Вычислить результат:
         * xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y))
         *
         * если
         * x = 7
         * y = 18
         * n = 3
         */
        task(14);

        x = 7;
        y = 18;
        int n = 3;

        // Ответ NaN
//        double result = Math.pow(x, n) *
//                ((5 * x + 7 * y) / (8 * x + 10 * y))
//                / ((3 * x - y) / (x + y));

        // Ответ Infinity
//        double result = Math.pow(x, n) *
//                ((double) (5 * x + 7 * y) / (8 * x + 10 * y))
//                / ((3 * x - y) / (x + y));

        // Ответ 0.0
//        double result = Math.pow(x, n) *
//                ((5 * x + 7 * y) / (8 * x + 10 * y))
//                / ((3 * x - y) / (double)(x + y));

        // Ответ 1949.9646892655367
        double result = Math.pow(x, n) *
                ((double) (5 * x + 7 * y) / (8 * x + 10 * y))
                / ((3 * x - y) / (double)(x + y));

        text = ANSI_BLUE + "IF" + ANSI_RESET + ENTER
                + ANSI_RED + "x = " + (int)x + ENTER
                + "y = " + (int)y + ENTER
                + "n = " + n + ANSI_RESET +ENTER
                + ANSI_BLUE + "then" + ANSI_RESET + ENTER
                + ANSI_GREEN + "xⁿ((5x + 7y) / (8x + 10y)) "
                + "/ ((3x - y)/(x + y)) = " + result;

        System.out.println(text);

        /**
         * 15. Записать условие задачи в виде формулы и вычислить ответ:
         * В мастерской за 5 дней сшили 15 костюмов, поровну за каждый день.
         * За сколько дней при той же ежедневной средней выработке
         * сошьют 69 костюмов?
         */
        task(15);

        int quantityOfDays = 5;
        int quantityOfSuits = 15;
        int suitsPerDay = quantityOfSuits / quantityOfDays;
        int overallSuits = 69;
        int overallDays = overallSuits / suitsPerDay;
        String task = "Задача:\n";
        text = "В мастерской за ";
        text1 = " дней сшили ";
        text2 = " костюмов, поровну за каждый день. \nЗа сколько дней " +
                "при той же ежедневной средней выработке сошьют ";
        text3 =  " костюмов?";
        text4 = "Ответ: ";

        System.out.println(
                task + ANSI_GREEN + text + quantityOfDays + text1
                        + quantityOfSuits + text2 + overallSuits + text3
                        + ENTER + ANSI_BLACK + text4 + ANSI_RED + overallDays
        );

        /**
         * 16. Декларировать и инициализировать переменные a, b, c.
         * Распечатать выражение и результаты вычислений:
         * Сумма чисел a, b, c++ и sumABC-- = …, а разность b++ и  sumCBA = …
         */
        part();
        task(16);

         a = 4;
         b = 5;
         c = 6;
         int sumABC = a + b + c;
         int sumCBA = sumABC;
         text1 = "Сумма чисел a, b, c++ и sumABC-- = ";
         text2 = ", а разность b++ и sumCBA = ";

        String answer = text1 + (a + b + c++ + sumABC--) + text2 + (b++ - sumCBA);
        System.out.println("\u001b[32m." + answer);

        /**
         * 17. Записать и вычислить выражение (x + 3)^2
         */
        task(17);

        answer = "(x + 3)^2 = " + (int)Math.pow(x + 3, 2);

        System.out.println(answer);

        /**
         * 18.
         */
        task(18);
        result = ((3 + 4 * x) / 5) - ((10 * (y - 5) * (a + b + c)) / x) + (9 * (4 / x + (9 + x) / y));

        answer = "((3 + 4 * x) / 5) - ((10 * (y - 5) " +
                "* (a + b + c)) / x) + (9 * (4 / x + (9 + x) / y)) = " + result;

        System.out.println(answer);

        /**
         * 19.
         */
        task(19);

        d = 4;

        result = ((double)(5 * x + 7 * y) / (double)(8 * x + 10 * y)) / ((3 * x - y)
                / (double)(x + y)) / (a + b + (c / d) + ((double)(a + b) / (c + d)) + (a * b));

        answer = "(((5 * x + 7 * y) / (8 * x + 10 * y)) / ((3 * x - y) "
                + "/ (x + y))) / (a + b + (c / d) + ((a + b) / (c + d)) "
                + "+ (a * b)) = " + result;

        System.out.println(answer);

        /**
         * 20. Ввести в программу формулу конвертации температур C° -> F°.
         * Найти на сайте https://openweathermap.org/
         * температуру в любом городе, и проверьте, соответствует ли
         * температура в С и F вашим рассчетным значениям
         * (использовать только int)
         *
         * * Кто хочет - проверьте погоду в K (кельвинах)
         * и ее соответствие с рассчетным значением
         */

        task(20);

        int temperatureInCelsius = 27;
        int temperatureInFahrenheit = (temperatureInCelsius * 9 / 5) + 32;
        int temperatureInKelvin = temperatureInCelsius + 273;
        text = "Температура в Лимассоле в Цельсиях = ";
        text1 = "Температура в Лимассоле в Фаренгейтах = ";
        text2 = "Температура в Лимассоле в Кельвинах = ";
        text3 = "°C";
        text4 = "°F";
        String text5 = "°K";

        System.out.println(
                text + temperatureInCelsius + text3 + ENTER
                        + text1 + temperatureInFahrenheit + text4 + ENTER
                        + text2 + temperatureInKelvin + text5);
                

    }
}