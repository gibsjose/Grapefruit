/*************************************************
*	@file:		Instructor.java
* 	@author: 	Joe
* 	@date:		Mar 24, 2014
*
*	@description:
*	
*************************************************/
package grapefruit;

/*************************************************
 *	@author Joe
 *
 *************************************************/
public class Instructor {
	protected String firstName;
	protected String lastName;
	protected String email;
	
	/*************************************************
	*	
	*************************************************/
	public Instructor() {
		this.firstName = "Juan";
		this.lastName = "Hernandez";
		this.email = "juan.hernandez@univ.edu";
	}

	/*************************************************
	 *	@return firstName
	 *************************************************/
	public String getFirstName() {
		return firstName;
	}

	/*************************************************
	 *	@param firstName : firstName
	 *************************************************/
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/*************************************************
	 *	@return lastName
	 *************************************************/
	public String getLastName() {
		return lastName;
	}

	/*************************************************
	 *	@param lastName : lastName
	 *************************************************/
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/*************************************************
	 *	@return email
	 *************************************************/
	public String getEmail() {
		return email;
	}

	/*************************************************
	 *	@param email : email
	 *************************************************/
	public void setEmail(String email) {
		this.email = email;
	}
	
}
