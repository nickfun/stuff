import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class JavaDate {

    public static void main(String[] args) {
	Date d = new Date();
	d.setDate(15);
	d.setMonth(7);
	d.setYear(2014);
	System.out.println("date is " + d);
	Calendar cal = new GregorianCalendar();
	cal.setTime(d);
	System.out.println("Cal is " + cal.get(Calendar.DAY_OF_WEEK));
	int[] DaysToJava = {
	    0,
	    Calendar.MONDAY,
	    Calendar.TUESDAY,
	    Calendar.WEDNESDAY,
	    Calendar.THURSDAY,
	    Calendar.FRIDAY,
	    Calendar.SATURDAY,
	    Calendar.SUNDAY
	};
	for (int i : DaysToJava) {
	    System.out.println(i + ": " + DaysToJava[i]);
	}
    }
}
