import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;



public class TriangleTypeStructuralTest extends TriangleType {
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
		assertEquals("This test case was suppose to return 4", 4, t.triangleType(1,2,3));
		assertEquals("This test case was suppose to return 4", 4, t.triangleType(3,2,1));
		assertEquals("This test case was suppose to return 4", 4, t.triangleType(1,3,2));
	}
	@Test 
	//out of bounds
	public void test_out_of_bounds() {

		assertEquals("This test case was suppose to return 5", 5, t.triangleType(1001,1001,1001));
		assertEquals("This test case was suppose to return 5", 5, t.triangleType(999,999,1001));
		assertEquals("This test case was suppose to return 5", 5, t.triangleType(1001,999,999));
		assertEquals("This test case was suppose to return 5", 5, t.triangleType(999,1001,999));
		
	}
	
	
	@Test 
	//not describe a triangle(negative)
	public void test_negative_input() {

		assertEquals("This test case was suppose to return 4", 4, t.triangleType (-1,-1,-1));
		assertEquals("This test case was suppose to return 4", 4, t.triangleType (-1,1,1));
		assertEquals("This test case was suppose to return 4", 4, t.triangleType (1,-1,1));
		assertEquals("This test case was suppose to return 4", 4, t.triangleType (1,1,-1));
		assertEquals("This test case was suppose to return 4", 4, t.triangleType (0,0,0));
	}
	
	@Test 
	//not describe a triangle(negative)
	public void one_two() {

		assertEquals("This test case was suppose to return 2", 2, t.triangleType(2,2,3));
		assertEquals("This test case was suppose to return 4", 4, t.triangleType(2,2,4));
		
		
		
	}
	@Test 
	//not describe a triangle(negative)
	public void two_three() {

		assertEquals("This test case was suppose to return 2", 2, t.triangleType(4,3,3));
		assertEquals("This test case was suppose to return 4", 4, t.triangleType(6,3,3));
		
	}
	@Test 
	//not describe a triangle(negative)
	public void one_three() {
		assertEquals("This test case was suppose to return 4", 4, t.triangleType(28,56,28));
		
	}
	@Test 
	//not describe a triangle(negative)
	public void one_two_three() {

		assertEquals("This test case was suppose to return 4", 4, t.triangleType(28,28,1000));
		assertEquals("This test case was suppose to return 4", 4, t.triangleType(28,28,56));
		
	}

	
	
	
	
}
