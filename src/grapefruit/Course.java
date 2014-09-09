/*************************************************
*	@file:		Course.java
* 	@author: 	Joe
* 	@date:		Mar 24, 2014
*
*	@description:
*	
*************************************************/
package grapefruit;

import java.util.ArrayList;

/*************************************************
 *	@author Joe
 *
 *************************************************/
public class Course {
	
	protected String name;
	protected Instructor instructor;
	protected String subject;
	protected String subjectID;
	protected int subjectNumber;
	protected ArrayList<Event> meetingTimes;
	//protected ArrayList<Homework> homeworks;
	//TODO Add in Test array and setters/getters for homework

	/*************************************************
	 *	
	 *************************************************/
	public Course() {
		this.name = "New Course";
		this.instructor = new Instructor();
		this.subject = "None";
		this.subjectID = "NA";
		this.subjectNumber = 101;
		meetingTimes = new ArrayList<Event>();
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
	 *	@return instructor
	 *************************************************/
	public Instructor getInstructor() {
		return instructor;
	}

	/*************************************************
	 *	@param instructor : instructor
	 *************************************************/
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	/*************************************************
	 *	@return subject
	 *************************************************/
	public String getSubject() {
		return subject;
	}

	/*************************************************
	 *	@param subject : subject
	 *************************************************/
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/*************************************************
	 *	@return subjectID
	 *************************************************/
	public String getSubjectID() {
		return subjectID;
	}

	/*************************************************
	 *	@param subjectID : subjectID
	 *************************************************/
	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}

	/*************************************************
	 *	@return subjectNumber
	 *************************************************/
	public int getSubjectNumber() {
		return subjectNumber;
	}

	/*************************************************
	 *	@param subjectNumber : subjectNumber
	 *************************************************/
	public void setSubjectNumber(int subjectNumber) {
		this.subjectNumber = subjectNumber;
	}

	/*************************************************
	 *	@return meetingTimes
	 *************************************************/
	public ArrayList<Event> getMeetingTimes() {
		return meetingTimes;
	}

	/*************************************************
	 *	@param meetingTimes : meetingTimes
	 *************************************************/
	public void setMeetingTimes(ArrayList<Event> meetingTimes) {
		this.meetingTimes = meetingTimes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		String courseString = "";
		
		courseString += "Course\n";
		courseString += "====================\n";
		courseString += "Name: " + this.name + "\n";
		courseString += "Instructor Name: " + this.instructor.getFirstName() + " " + this.instructor.getLastName() + "\n";
		courseString += "Subject: " + this.subject + "\n";
		courseString += "Subject ID: " + this.subjectID + " " + this.subjectNumber + "\n";
		
		if(!meetingTimes.isEmpty()) {
			
			for(Event e: this.meetingTimes)
			{
				courseString += e.toString() + "\n";
			}
		}
		
		courseString += "====================\n";
		
		return courseString;
	}

}
