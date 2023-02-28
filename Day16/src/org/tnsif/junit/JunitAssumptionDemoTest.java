package org.tnsif.junit;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class JunitAssumptionDemoTest {

	@Test
	void test() {
//		assumeTrue(10>5);
		Assumptions.assumeTrue(12>1);
	}
	@Test
	void accept() {
	
		Assumptions.assumeTrue(12==12);
}
}