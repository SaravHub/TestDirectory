package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;

public class LoginPage extends TestNgHooks{
	
	/*
	 * 3 fields -> user name, password, login
	 * business action -> type, type, click
	 * where does it take the action -> 
	 * 1) type username -> same screen
	 * 2) type password -> same screen
	 * 3) click login -> home page (if all data is correct)
	 * 				  -> same page (when data fails)
	 */
	
	// this keyword in Java that refers to the local class
	// return can be any primitive / non-primitive
	
	
	
	public LoginPage typeUserName(String user) {
		driver.findElement(By.name("USERNAME")).sendKeys(user);
		return this;
	}
	
	public LoginPage typePassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
