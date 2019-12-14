package ignore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreDmo {
	@Test
	@Ignore
	public void test1() {
		System.out.println("Test 1");
	}
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
}
