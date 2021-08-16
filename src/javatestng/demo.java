package javatestng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class demo {
     
	/*
	 * @BeforeSuite public void aabsuite() {
	 * 
	 * System.out.println("executing before suite"); }
	 */
	@BeforeMethod
	public void aabmethod() {
		
		System.out.println("executing before method");
	}
	
	/*
	 * @BeforeClass public void aabclass() {
	 * 
	 * System.out.println("executing before class"); }
	 */
	
	
	/*
	 * @Test public void aa1() {
	 * 
	 * System.out.println("executing  test-1"); }
	 */
	   
}
