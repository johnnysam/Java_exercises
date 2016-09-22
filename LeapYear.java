import java.util.GregorianCalendar;
import java.util.Scanner;
//import java.util.Calendar;

public class LeapYear
{
    public static boolean isLeapYear(int year)
    {
        GregorianCalendar gc = new GregorianCalendar();
        return gc.isLeapYear(year);
    }

    /*  Alternative implementation
    public static boolean isLeapYear(int year)
    {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        int days = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
        return (days > 365);
    }
    */

    public static void main(String[] args)
    {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year to check if it is leap year: ");
        year = input.nextInt();
        System.out.printf("%d is%s a leap year\n", year, isLeapYear(year)? "":" not");
    }
}
