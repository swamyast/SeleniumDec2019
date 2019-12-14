package testNGExamples;

import org.testng.annotations.Test;

@Test(groups= {"All tests"})
public class GroupsDemo {

	@Test(groups = {"sanity"})
	public void test1() {
	System.out.println("executing test 1");	
	}
	@Test(groups= {"regression"})
	public void test2() {
		System.out.println("executing test 2");
	}
	
	@Test(groups= {"windows.sanity"})
	public void test3() {
		System.out.println("executing test 3");
	}
	
	@Test(groups = {"linux.snity"})
	public void test4() {
		System.out.println("executing test 4");
	}
	@Test(groups = {"smoke","sanity"})
	public void test5() {
		System.out.println("executing test 4 smoke");
		
	}

	public void test6() {
		System.out.println("executing all  group");
		
	}
}
