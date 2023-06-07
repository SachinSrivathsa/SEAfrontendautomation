package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SEAFrontEndAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		//To open the browser in Chrome
		driver.get("http://localhost:3000");
		//Maximizing the web page
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//To navigate to the 'cases' page.
		driver.findElement(By.xpath("//a[@class='sc-hLBbgP cdrKpt'][3]")).click();
		//Verifying the URL of the navigated web page
		if(driver.getCurrentUrl().endsWith("http://localhost:3000/cases")) {
			System.out.println("Navigation successful");
		}else {
			System.out.println("Navigation failed");
		}
		//To check if the text field accepts negative numbers
		WebElement minKeys = driver.findElement(By.xpath("//input[@name = 'minAge']"));
		//Entering a negative value:
		minKeys.sendKeys("-3");
		Thread.sleep(2000);
		WebElement maxKeys = driver.findElement(By.xpath("//input[@name='maxAge']"));
		maxKeys.sendKeys("-2");
		//Pressing the button to check the results
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
