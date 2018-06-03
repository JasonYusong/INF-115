import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;



public class TriangleTypeFunctionalTest extends TriangleType {
	TriangleType t;
	
	@Before
	public void setUp() {
		t = new TriangleType();
	}


	@Test 
	//scalene triangle
	public void test_scalene() {

		assertEquals("This test case was suppose to return 1", 1, t.triangleType(8,6,10));
		
	}
	@Test 
	//isosceles triangle
	public void test_isosceles() {

		assertEquals("This test case was suppose to return 2", 2, t.triangleType(100,6,100));
		
	}
	@Test 
	//equilateral triangle
	public void test_equilateral() {

		assertEquals("This test case was suppose to return 3", 3, t.triangleType(1,1,1));
		
	}
	@Test 
	//not describe a triangle
	public void test_not_triangle() {

		assertEquals("This test case was suppose to return 4", 4, t.triangleType(997,2,1));
		
	}
	@Test 
	//out of bounds
	public void test_out_of_bounds() {

		assertEquals("This test case was suppose to return 5", 5, t.triangleType(1000,1000,1001));
		
	}
	


	


}
