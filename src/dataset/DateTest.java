/**
 * 
 */
package dataset;

import java.util.Date;
import java.util.Timer;

/**
 * @author opensource
 *
 */
public class DateTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DateClass obj = new DateClass();
		obj.setDate(new Date());
		obj.setDate(null);
		obj.setDate(new Date());
		obj.setTimer(new Timer());


		System.out.println("The Date is current: " + obj.getDate());
		System.out.println("The current time is: " + obj.geTimer());
		
	}
	
}
