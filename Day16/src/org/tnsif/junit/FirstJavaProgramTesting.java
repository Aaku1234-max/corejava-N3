package org.tnsif.junit;
//program to demonstrate on first Junit5 testing
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FirstJavaProgramTesting {

	@Test
	@DisplayName("simpleJunittestingMethod")
	void Test() {
		System.out.println("first junit5 Test case");
	}

	@Test
	void display() {
		System.out.println("Welcome to junit5 Testing");
	}

}
