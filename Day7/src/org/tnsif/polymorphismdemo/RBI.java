package org.tnsif.polymorphismdemo;

public class RBI {
	float getInterest() {
		return 10.8f;     //we cannot override same method in same class without using inheritance 
		                            /*float getInterest() {    get error
		                                     return 10.8f;
	                                         }*/
	}
	

}
