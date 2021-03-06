import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test harness
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a month");
        int m = input.nextInt();

        System.out.print("Please enter a full year (e.g. 2018): ");
        int y = input.nextInt();
        printMonth(y, m);
    }

    static void printMonth(int year, int month) {
        YearMonth ym = YearMonth.of(year, month);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int counter = 1;

        int dayValue = LocalDate.of(year, month, 1).getDayOfWeek().getValue();
        if (dayValue != 7)
            for (int i = 0; i < dayValue; i++, counter++) {
                System.out.printf("%-4s", "");
            }

        for (int i = 1; i <= ym.getMonth().length(ym.isLeapYear()); i++, counter++) {
            System.out.printf("%-4d", i);

            if (counter % 7 == 0) {
                System.out.println();
            }
        }
    }
}