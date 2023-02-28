package org.tnsif.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
public class JunitAnnotationsDemo {
	@Test
	@DisplayName("simpleJunittestingMethod")
	void Test() {
		System.out.println("first junit5 Test case");
	}

	@Test
	@BeforeAll  
	/*if we make method as static then we will not get method name in testing
	 to overcome this we must to use "testInstance(Lifecycle.PER_CLASS)*/
	 /*static*/ void display() {
		System.out.println("Welcome to junit5 Testing");
	}
	@Test
	@AfterEach
	void accept() {
		System.out.println("After Each Method demo");
	}


}
