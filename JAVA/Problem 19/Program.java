/**
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 * 
 * Richard Bensics
 * 1/22/17
 */

import java.util.Calendar;

public class Program
{
    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();
        int numSundays = 0;

        for(int year = 1901; year < 2001; year++)
        {
            for(int month = 0; month < 12; month++)
            {
                calendar.set(year, month, 1);
                if ( calendar.get(Calendar.DAY_OF_WEEK) == 1 ) // java.util.* constant field value, 1 = Sunday
                {
                    numSundays++;
                }
            }
        }
        
        System.out.println( "There are " + numSundays + " Sundays occuring in the first month during the 21st century");
    }
}
