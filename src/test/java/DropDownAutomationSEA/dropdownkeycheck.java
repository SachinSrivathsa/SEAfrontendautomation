package DropDownAutomationSEA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownkeycheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		//To check if we can send keys in the drop down
		WebElement status = driver.findElement(By.xpath("//select[@name='status']"));
		status.sendKeys("A");
		Thread.sleep(1000);
		status.sendKeys("U");
		//To check the second dropdown
		Thread.sleep(1000);
		WebElement motive = driver.findElement(By.xpath("//select[@name='motive']"));
		motive.sendKeys("Z");
		//To check if the dropdown accepts numbers
		Thread.sleep(1000);
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		country.sendKeys("5");
	}

}
