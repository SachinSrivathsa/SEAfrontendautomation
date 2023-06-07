package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class summarycases extends SEAFrontEndAutomation{

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		//To check if the text field accepts string as an input
		WebElement minText = driver.findElement(By.xpath("//input[@name = 'minAge']"));
		minText.sendKeys("Twenty three");
		Thread.sleep(2000);
		WebElement maxText = driver.findElement(By.xpath("//input[@name='maxAge']"));
		maxText.sendKeys("Fourty");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Refreshing a web page
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//To check if the maximum and minimum age is visible or not.
		WebElement minVis = driver.findElement(By.xpath("//div[@style='padding: 12px;'][5]"));
		if(minVis.isEnabled()) {
			System.out.println("The age is visible");
		}else {
			System.out.println("The age is not visible");
		}
		
		
	}

}
