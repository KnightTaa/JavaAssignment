package q6;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Date date = new Date(3,1,1997);

        System.out.print("Enter the month: ");
        int month = input.nextInt();
        date.setMonth(month);

        System.out.print("Enter the day: ");
        int day = input.nextInt();
        date.setDay(day);

        System.out.print("Enter the year: ");
        int year = input.nextInt();
        date.setYear(year);

        date.displayDate();
    }
}
