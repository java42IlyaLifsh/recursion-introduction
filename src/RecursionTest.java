import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//HW_18 IlyaL
class RecursionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		f(50);
	}

	private void f(int a) {
		if (a > 3) {
			int b = a - 1;
			f(b );
		}
		
	}
	@Test
	void factorialTest() {
		assertEquals(24, Recursion.factorial(4));
		assertEquals(1, Recursion.factorial(0));
		boolean fl = false;
		try {
			Recursion.factorial(-100);
		} catch(IllegalArgumentException e) {
			fl = true;
		}
		assertTrue(fl);
	}
	@Test
	void powTest() {
		assertEquals(4, Recursion.pow(-2, 2));
		assertEquals(4, Recursion.pow(2, 2));
		assertEquals(-8, Recursion.pow(-2, 3));
		assertEquals(8, Recursion.pow(2, 3));
		boolean fl = false;
		try {
			Recursion.pow(10, -10);
		} catch (IllegalArgumentException e) {
			fl = true;
		}
		assertTrue(fl);
		boolean f2=false;
		try{
			Recursion.pow(0, 0);
		} catch (IllegalAccessError e) {
			f2=true;
			
		}
		assertTrue(f2);
	}
		
	@Test
	void sumtest() {
		assertEquals(10, Recursion.sum(new int[] {30, 20, -40}));
		assertEquals(0, Recursion.sum(new int[0]));
	}
	@Test
	void squareTest() {
		assertEquals(4, Recursion.square(2));
		assertEquals(4, Recursion.square(-2));
		assertEquals(100, Recursion.square(10));
	}

}
