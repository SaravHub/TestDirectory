package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{

	@Given("Enter the username as {string}")
	public void userName(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@And("Enter the password as {string}")
	public void passWord(String passWord) {
		driver.findElement(By.id("password")).sendKeys(passWord);
	}

	@When("Click login button")
	public void login() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage should be displayed.")
	public void homepage() {
	    String title = driver.getTitle();
	    System.out.println(title);
	}
	@But("Error message should be displayed")
	public void negCase() {
	    String title = driver.getTitle();
	    System.out.println(title+"password is wrong");
	}
}
