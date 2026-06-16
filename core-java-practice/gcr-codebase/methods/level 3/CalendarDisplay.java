import java.util.*;

public class CalendarDisplay {

    static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }

    static int getDaysInMonth(int month, int year) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        if(month == 2 && isLeapYear(year))
            return 29;

        return days[month-1];
    }

    static int firstDay(int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, 1);
        return cal.get(Calendar.DAY_OF_WEEK)-1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Month: ");
        int month = sc.nextInt();

        System.out.print("Year: ");
        int year = sc.nextInt();

        String[] months = {
            "January","February","March","April",
            "May","June","July","August",
            "September","October","November","December"
        };

        System.out.println("\n   " + months[month-1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int start = firstDay(month, year);

        for(int i=0;i<start;i++)
            System.out.print("    ");

        int days = getDaysInMonth(month, year);

        for(int d=1; d<=days; d++) {

            System.out.printf("%3d ", d);

            if((start+d)%7==0)
                System.out.println();
        }
    }
}