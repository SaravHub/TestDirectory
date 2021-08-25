package week6.day2.classroom;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class TestNgTest {
	@Test
	public void create() {
		System.out.println("Create");
		throw new NoSuchElementException("ERR");
	}
	@Test
	public void delete() {
		System.out.println("delete");
	}
	@Test
	public void login() {
		System.out.println("login");
	}
	@Test
	public void edit() {
		System.out.println("edit");
		throw new NoSuchElementException("ERR");
	}
}
