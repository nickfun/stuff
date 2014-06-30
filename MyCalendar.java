import java.util.*;
import java.text.*;

public class MyCalendar {
    public static void main(String[] args) {
        SimpleDateFormat fmFullInUTC = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar oCal;
        oCal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        oCal.set(Calendar.YEAR, 2014);
        oCal.set(Calendar.MONTH, Calendar.MAY);
        oCal.set(Calendar.DATE, 25);
        oCal.set(Calendar.HOUR_OF_DAY, 0);
        oCal.set(Calendar.MINUTE, 0);
        oCal.set(Calendar.SECOND, 0);
        oCal.set(Calendar.MILLISECOND, 0);
        System.out.println("Holiday: " + fmFullInUTC.format(oCal.getTime()));

    }
}
