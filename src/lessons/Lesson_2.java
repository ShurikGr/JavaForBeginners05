package lessons;

public class Lesson_2 {
    public static void main(String[] args) {
        String line = "______________________";
        String task = "Задание № ";
        int count = 1;

        System.out.println(line);
        System.out.println(task + (++count));

        int a = 5;
        int b = -5;
        int c = 5;

        int sumAB = a + b;
        int sumBC = b + c;

        System.out.println(line);
        System.out.println("sumAB = " + sumAB);
        System.out.println("sumBC = " + sumBC);

        int subAB = a - b;
        int subBA = b - a;

        System.out.println(line);
        System.out.println("subAB = " + subAB);
        System.out.println("subBA = " + subBA);

        int multAB = a * b;
        int divAB = a / b;

        System.out.println(line);
        System.out.println("multAB = " + multAB);
        System.out.println("divAB = " + divAB);

        int remAB = a % b;

        System.out.println(line);
        System.out.println("remAB = " + remAB);
        System.out.println( "remAB = " + remAB);




    }
}