package week2.day2.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonActs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driv=new ChromeDriver();
		driv.get("http://leafground.com/pages/radio.html");
		driv.manage().window().maximize();
		driv.findElement(By.xpath("//*[@for='yes']/input")).click();
		WebElement rad1=driv.findElement(By.xpath("(//section[@class='innerblock']/div[2]/div/div/label//following-sibling::label/input)[1]"));
		//WebElement rad2=driv.findElement(By.xpath("(//section[@class='innerblock']/div[2]/div/div/label//following-sibling::label/input)[2]"));
		if(rad1.isSelected())
			System.out.println("First Radio button is checked");
		else
			System.out.println("Second Radio button is checked");
		String txtValue1=driv.findElement(By.xpath("((//label[@for='java'])[3]/following::input)[1]")).getText();
		System.out.println(txtValue1);
		List<WebElement> lis=driv.findElements(By.xpath("(//label[@for='java'])[3]/following::input"));
		for (int i=1;i<=lis.size();i++) {
			String txtValue=driv.findElement(By.xpath("((//label[@for='java'])[3]/following::input)["+i+"]")).getText();
			System.out.println(txtValue);
			if(txtValue.contains("21"))
				System.out.println("Have 21");
			else 
				System.out.println("Other Age");
		}
	}

}
/*----------Doubt Case after line 19-----------*?
/*List<WebElement> radio=driv.findElements(By.xpath("//section[@class='innerblock']/div[2]/div/div/label//following-sibling::label/input"));
WebElement rad;
for (int i = 1; i <= radio.size(); i++) {
	rad=radio.get(i);
	String b=rad.getAttribute("checked");
	if(b.equalsIgnoreCase("Checked"))
		System.out.println(i+"checked");
	else
		System.out.println("No one is Checked");*/
/*----------------------------------------------------------*/
	//String j=driv.findElement(By.xpath("(//section[@class='innerblock']/div[2]/div/div/label//following-sibling::label/input)["+i+"]")).getAttribute("checked");
	//System.out.println(j);
	//if(j.equalsIgnoreCase("true"))
		//System.out.println("Radio button"+i+"Checked");
	//else
		//System.out.println("No button is checked");
