package caseToolsAssignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Program1Test {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int result = Program1.add(5, 5);
		assertEquals(10, result);
	}

	@Test
	public void testAdd1() {
		int result = Program1.add1(6, 6);
		assertEquals(12, result);
	}
	
}
