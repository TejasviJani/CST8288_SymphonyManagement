/* **************************************************************
 * Algonquin College - School of Advanced Technology
 * CST 8288 - Object Oriented Programming with Design Patterns
 * Project 1 - Symphony Management System
 * 
 * Author: 
 * Student #: 
 * Network login name: 
 * Lab instructor: CAROLYN A. MACISAAC
 * Section: 014
 * Due date: 2016.11.27
 *
 *  -- Class definition 				   
 * Purpose -- 
 * **************************************************************/
package symphony.test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.Before;
/**
 * Description of this class.
 * @author    Name
 * @version   1.0.0 Date
 */
public class Test_Conductor extends TestCase {
	
	/**
	 * Default constructor that calls the superclass constructor
	 * 
	 * @param name the name of the test
	 *************************************************************/
	public Test_Conductor(String name) {
		super(name);
	}

	/**
	 * Creates an instance of a TestSuite and passes the Test_Conductor
	 * class as a parameter.	 
	 * @return an instance of TestSuite
	 *************************************************************/
	public static TestSuite suite() {
		return new TestSuite(Test_Conductor.class);
	}
	
	/**
	 * Prints message when test case has finished executing
	 * 
	 *************************************************************/
	protected void tearDown() throws Exception {
		System.out.println("Test_Conductor End");
	}
	
	/**
	 * 
	 * 
	 *************************************************************/
	@Before
	public void setUp() throws Exception {
		System.out.println("Test_Conductor Begin");		
	}
	
	/* CONSTRUCTORS	-----------------------------------------------------	*/
	


	/* ACCESSORS	-----------------------------------------------------	*/
	


	/* MODIFIERS	-----------------------------------------------------	*/
	


	/* NORMAL BEHAVIOR --------------------------------------------------	*/
	



	/* HELPER METHODS	--------------------------------------------------	*/




	/* ATTRIBUTES	-----------------------------------------------------	*/											



}	/*	End of CLASS:	Test_Conductor.java			*/

