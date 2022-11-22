package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitTestFunctions junit = new jUnitTestFunctions();
		int result = junit.addNumbers(50, 51);
		assertEquals(101, result);
	}

}
