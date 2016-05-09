package tests;

import static org.junit.Assert.*;
import triangulo.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

	public Triangle triangle = null;
	
	@Before
	public void setUp() {
		triangle = new Triangle();
	}
	
	@Test
	public void testNotTriangle() {
		assertEquals("Not a triangle", triangle.makeTriangle(0,0,0));		
	}
	
	@Test
	public void testEquilateral() {
		assertEquals("Equilateral", triangle.makeTriangle(3, 3, 3));
	}
	
	@Test
	public void testIsosceles() {
		assertEquals("Isosceles", triangle.makeTriangle(3, 3, 3));
	}

	@Test
	public void testScalene() {
		assertEquals("Scalene", triangle.makeTriangle(3, 3, 3));
	}
	
}
