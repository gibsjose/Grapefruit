/*************************************************
*	@file:		Main.java
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
public class Main {

	/*************************************************
	 *	@method:	main
	 *	
	 *	@param:
	 *
	 *	@return:
	 *
	 *	@param args
	 *************************************************/
	public static void main(String[] args) {
		
		Course course = new Course();
		
		course.instructor.setFirstName("Joe");
		course.instructor.setLastName("Gibson");
		course.instructor.setEmail("gibsjose@mail.gvsu.edu");
		course.setName("Intro to Computer Engineering");
		course.setSubject("Engineering");
		course.setSubjectID("EGR");
		course.setSubjectNumber(101);
		
		System.out.println(course.toString());
	}

}
