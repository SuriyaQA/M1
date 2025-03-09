package GenericUtility;

import java.util.Date;
import java.util.Random;

/**
 * @author Suriya
 */

public class javaUtility {

	
	/**
	 * This method is used to return the Random number 
	 * @return
	 */
	public static int getRanDomNumber() {
		
		Random r = new Random();
		return r.nextInt(1000);
	}
	
    /**
     * This method is used to return the Date month and year
     * @return
     */
	public static  String get_Date_Month_Year() {
		
		Date d = new Date();
		int date = d.getDate();
		int month = d.getMonth()+1;
		int year = (d.getYear()-100)+2000;
		
		return date+""+month+""+year;
	}
	
	/**
	 * This method is used to return the Year Month and Date
	 * @return
	 */
	public static String get_Year_Month_Date() {
		
		Date d = new Date();
		int date = d.getDate();
		 int month = d.getMonth()+1;
		 int year = (d.getYear()-100)+2000;
		 
		 return year+""+month+""+date;
	}
}
