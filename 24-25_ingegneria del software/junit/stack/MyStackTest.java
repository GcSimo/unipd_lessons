//import org.junit.Assert.assertArrayEquals;
//import org.junit.Assert.assertEquals;
//import org.junit.Assert.assertFalse;
//import org.junit.Assert.assertNotFull;
//import org.junit.Assert.assertNotSame;
//import org.junit.Assert.assertNull;
//import org.junit.Assert.assertSame;
//import org.junit.Assert.assertThat;
//import org.junit.Assert.assertTrue;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class MyStackTest {
	public MyStack ms = null;
	
	@Before
	public void setUp() {
		ms = new MyStack();
	}

	@Test
	public void testEmpty() {
		assertTrue("A new Stack is NOT empty", ms.empty());
	}

	@Test
	public void testEmpty2() {
		ms.push(new Object());
		assertFalse("Stack still empty after push!", ms.empty());
	}
}
