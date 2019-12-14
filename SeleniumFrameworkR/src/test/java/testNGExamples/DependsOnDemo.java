package testNGExamples;

import org.testng.annotations.Test;

public class DependsOnDemo {
	@Test(dependsOnMethods = {"testd2","testd3"},dependsOnGroups = {"regressiond"})
	public void testd1() {
		System.out.println("Executing test All");
	}
	@Test
	public void testd2() {
		System.out.println("Executing test 2");
	}
	@Test
	public void testd3() {
		System.out.println("Executing test 3");
	}
	@Test(groups= {"regressiond"})
	public void testd4() {
		System.out.println("Executing test 4");
	}

}
