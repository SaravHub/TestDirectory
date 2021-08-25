package week5.day1.classroom;

import org.testng.annotations.Test;

public class ExampleTest extends Base{
	@Test(invocationCount=3)
	public void Example() {
		System.out.println("Execution");
	}
}
