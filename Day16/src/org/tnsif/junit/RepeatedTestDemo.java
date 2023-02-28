package org.tnsif.junit;
//program to demonstrate on Repeatation S
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestDemo {

	//@Test
	@RepeatedTest(5)
	void test() {
		System.out.println("Repeated Test annotation");
		}
		
	}

