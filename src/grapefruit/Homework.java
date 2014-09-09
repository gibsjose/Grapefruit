/*************************************************
*	@file:		Homework.java
* 	@author: 	Joe
* 	@date:		Mar 24, 2014
*
*	@description:
*	
*************************************************/
package grapefruit;

import java.util.Calendar;

/*************************************************
 *	@author Joe
 *
 *************************************************/
public class Homework extends Event {
	
	protected int estimatedTimeToComplete;

	/*************************************************
	 *	
	 *************************************************/
	public Homework() {
		this.estimatedTimeToComplete = 0;
		this.name = "New Homework";
		this.startDate = Calendar.getInstance();
		this.endDate = Calendar.getInstance();
		this.isAllDay = false;
		this.priority = Priority.None;
		this.note = "";
	}

	/*************************************************
	 *	@return estimatedTimeToComplete
	 *************************************************/
	public int getEstimatedTimeToComplete() {
		return estimatedTimeToComplete;
	}

	/*************************************************
	 *	@param estimatedTimeToComplete : estimatedTimeToComplete
	 *************************************************/
	public void setEstimatedTimeToComplete(int estimatedTimeToComplete) {
		this.estimatedTimeToComplete = estimatedTimeToComplete;
	}
	
}
