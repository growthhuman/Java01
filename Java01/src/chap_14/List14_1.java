package chap_14;

import java.util.Calendar;
import java.util.Date;

public class List14_1 {
	public static void main (String [] args){

	Date now = new Date();
	Calendar c = Calendar.getInstance();
	((Calendar) c).setTime(now);
	int y = c.get(Calendar.YEAR);
	System.out.println("¡”N‚Í" + y + "”N‚Å‚·");
	c.set(2010,8,22,1,23,45);
	c.set(Calendar.YEAR,2011);
	Date past = c.getTime();

	}
}
