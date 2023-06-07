package DropDownAutomationSEA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class keystrokenavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		//Navigating this browser window using keystrokes
		//Pressing the tab button on the first drop down
		Actions action = new Actions(driver);
		
		WebElement status = driver.findElement(By.xpath("//select[@name='status']"));
		status.sendKeys(Keys.TAB);
		
		WebElement motive = driver.findElement(By.xpath("//select[@name='motive']"));
		motive.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		status.sendKeys(Keys.ESCAPE);
		Thread.sleep(1000);
		motive.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Thread.sleep(1000);
		country.sendKeys(Keys.ARROW_UP);
		Thread.sleep(1000);
		motive.sendKeys(Keys.TAB);
		
		country.sendKeys(Keys.TAB);
		WebElement gender = driver.findElement(By.xpath("//select[@name='gender']"));
		gender.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		country.sendKeys(Keys.ESCAPE);
		Thread.sleep(1000);
		gender.sendKeys(Keys.TAB);
		
		//Pressing the view case button
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.sendKeys(Keys.ENTER);
	}

}
