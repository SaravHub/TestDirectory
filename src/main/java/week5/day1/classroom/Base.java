package week5.day1.classroom;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	@BeforeMethod
	public void loginPage() {
		System.out.println("@Beforemtd");
	}
	@AfterMethod
	public void close() {
		System.out.println("@Aftermtd");
	}
}
