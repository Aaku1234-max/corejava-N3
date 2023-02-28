package org.tnsif.junit;
//program to demonstrate on assertion annotation
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitAssertionDemo {

	@Test
	void test() {
		assertEquals(12,12);
	}
	@Test
	void display() {
		assertFalse(12==1);//fails when expression is true
	}

}
