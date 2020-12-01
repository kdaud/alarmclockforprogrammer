package dataset;

import java.util.Date;
import java.util.Timer;

public class DateClass {
	
	private Date date;
	
	private Timer timer;
	
	/**
	 * @return the time
	 */
	
	public Timer geTimer() {
		return timer;
	}
	
	/**
	 * @param timer the timer to set
	 */
	public void setTimer(Timer time) {
		this.timer = timer;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	

}
