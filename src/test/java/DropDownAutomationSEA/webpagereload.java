package DropDownAutomationSEA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

public class webpagereload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		driver.manage().window().maximize();
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.sendKeys(Keys.ENTER);
		//Refreshing the web page
		Thread.sleep(5000);
		driver.navigate().refresh();
	


	}

}
