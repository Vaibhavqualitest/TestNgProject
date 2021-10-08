package tests;

import org.testng.annotations.Factory;

public class Runner {
//	@Factory
//	public Object[] testAll() {
//		return new Object[] {
//				new TjTests()
//		};
//	}
	
	@Factory
	public Object[] testAll() {
		Object[] test = new Object[1];
		test[0]=new TjTests();
		return test;
	}
}
 