/*************************************************
*	@file:		Event.java
* 	@author: 	Joe Gibson
* 	@date:		Mar 23, 2014
*
*	@description:
*	
*************************************************/
package grapefruit;

import java.util.Calendar;

public class Event {
	
	protected String name;			//Event name
	protected Calendar startDate;	//Event date
	protected Calendar endDate;		//Event end date
	protected boolean isAllDay;		//Event is all day
	protected Priority priority;	//Event priority
	protected String note;			//Event note
	
	/*************************************************
	*	Default Constructor
	*************************************************/
	public Event() {
		
		this.name = "New Event";
		this.startDate = Calendar.getInstance();
		this.endDate = Calendar.getInstance();
		this.isAllDay = false;
		this.priority = Priority.None;
		this.note = "";
	}

	/*************************************************
	 *	@return name
	 *************************************************/
	public String getName() {
		return name;
	}


	/*************************************************
	 *	@param name : name
	 *************************************************/
	public void setName(String name) {
		this.name = name;
	}


	/*************************************************
	 *	@return date
	 *************************************************/
	public Calendar getStartDate() {
		return startDate;
	}


	/*************************************************
	 *	@param date : date
	 *************************************************/
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}


	/*************************************************
	 *	@return endDate
	 *************************************************/
	public Calendar getEndDate() {
		return endDate;
	}

	/*************************************************
	 *	@param endDate : endDate
	 *************************************************/
	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}

	/*************************************************
	 *	@return isAllDay
	 *************************************************/
	public boolean isAllDay() {
		return isAllDay;
	}

	/*************************************************
	 *	@param isAllDay : isAllDay
	 *************************************************/
	public void setAllDay(boolean isAllDay) {
		this.isAllDay = isAllDay;
	}

	/*************************************************
	 *	@return priority
	 *************************************************/
	public Priority getPriority() {
		return priority;
	}


	/*************************************************
	 *	@param priority : priority
	 *************************************************/
	public void setPriority(Priority priority) {
		this.priority = priority;
	}


	/*************************************************
	 *	@return note
	 *************************************************/
	public String getNote() {
		return note;
	}


	/*************************************************
	 *	@param note : note
	 *************************************************/
	public void setNote(String note) {
		this.note = note;
	}
	
	public String toString() {
		
		String string;
		
		string = "";		
		string += "Event Name: " + this.name + "\n";
		string += "Start Date: " + this.startDate.toString() + "\n";
		string += "End Date: " + this.endDate.toString() + "\n";
		string += "All Day: " + (this.isAllDay ? "true" : "false") + "\n";
		string += "Priority: " + this.priority + "\n";
		string += "Note: " + this.note + "\n";
		
		return string;
	}
}
