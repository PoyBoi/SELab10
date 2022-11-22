package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTestFunctions junit = new jUnitTestFunctions();
		String result = junit.addStrings("Soft", "ware");
		assertEquals("Software", result);
	}
}
