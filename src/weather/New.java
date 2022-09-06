package weather;

import java.time.LocalDate;
import java.time.Period;

public class New {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate yob = LocalDate.of(1990, 12, 25);
        Period period = Period.between(yob, today);

        System.out.println(period.getYears());
    }
}
