package ccw.a11;


/*********************************************************
 https://github.com/codycoolwaffle/APCS/tree/master/src/ccw
 *********************************************************/




/*
 * AP CS MOOC
 * Term 2 - Assignment 1: Time
 * A class which represents the time of day in hours and seconds.
 */

//Cody was here

public class Time implements Comparable
{
	private int hour;
	private int minute;
  
  /* Complete required constructors and methods here */

	/*
	 *Default constructor that sets time to 1200.
	 */
	public Time()
	{
		this(12, 0);
	}

	/*
	 * If h is between 1 and 23 inclusive, set the hour to h.
	 * Otherwise, set the hour to 0. If m is between 0 and 59 inclusive,
	 * set the minutes to m. Otherwise, set the minutes to 0.
	 */
	public Time(int h, int m)
	{
		hour = 0;
		minute = 0;

		if(h >= 1 && h <= 23)
		{
			hour = h;
		}
		if(m >= 1 && m <= 59)
		{
			minute = m;
		}
	}

	/* Returns the time as a String of length 4 in the format: 0819.
	 * Notice that if the hour or minute is one digit, it should
	 * print a zero first. For example, 6 should print as 06.
	 */
	public String toString()
	{
		String s = "";
		if(hour < 10)
		{
			s = "0";
		}
		s += hour;
		if(minute < 10)
		{
			s += "0";
		}
		s += minute;
		return s;
	}

	/*
	 * Returns the time as a String converted from military time
	 * to standard time. For example, 0545 becomes 5:45 am and
	 * 1306 becomes 1:06 pm.
	 */
	public String convert()
	{
		String s = "";
		int altered = 0;
		String suffix = null;
		if(hour < 12)
		{
			suffix = "AM";
		}
		else
		{
			suffix = "PM";
		}
		if(hour > 12)
		{
			hour -= 12;
			altered = 1;
		}
		if(hour == 0)
		{
			hour += 12;
			altered = 2;
		}
		s += (hour);
		s += ":";
		if(minute < 10)
		{
			s += 0;
		}
		s += minute;
		s += " " + suffix;
		if(altered == 1)
		{
			hour += 12;
			altered = 0;
		}
		if(altered == 2)
		{
			hour -= 12;
			altered = 0;
		}
		return s;
	}

	/*
	 * Advances the time by one minute.
	 * Remember that 60 minutes = 1 hour.
	 * Therefore, if your time was 0359, and you add one minute,
	 * it becomes 0400. 2359 should increment to 0000.
	 */
	public void increment()
	{
		minute += 1;
		if(minute == 60)
		{
			minute = 0;
			hour += 1;
			if(hour == 24)
			{
				hour = 0;
			}
		}
	}

	public int compareTo(Object other)
	{
		return toString().compareTo(other.toString());
	}

	public String difference(Time t)
	{
		String x = toString();
		String y = t.toString();
		int tempMinute = minute;
		int tempMinute2 = minute;
		minute = 0;
		int tempHour = hour;
		int tempHour2 = hour;
		hour = 0;
		int convert = 0;

		if(x.compareTo(y) == 0)
		{
			convert = 0;
		}
		else if(x.compareTo(y) > 0)
		{
			convert = 1;
		}
		else if(x.compareTo(y) < 0)
		{
			convert = -1;
		}

		if(convert == 1)
		{
			for(int i = 0; toString().compareTo(t.toString()) != 0; i++)
			{
				increment();
				tempMinute2 -= 1;
				if(tempMinute2 == -1)
				{
					tempMinute2 = 59;
					tempHour2 -= 1;
					if(tempHour2 == -1)
					{
						tempHour2 = 23;
					}
				}
			}
		}

		if(convert == -1)
		{
			for(int i = 0; toString().compareTo(t.toString()) != 0; i++)
			{
				increment();
				tempMinute2 += 1;
				if(tempMinute2 == 60)
				{
					tempMinute2 = 0;
					tempHour2 += 1;
					if(tempHour2 == 24)
					{
						tempHour2 = 0;
					}
				}
			}
		}

		String out = this.toString();
		minute = tempMinute;
		hour = tempHour;
		return out;
	}


}
//Yay!
/**
 Why did you come all the way down here?
 **/