package SummaryPageTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class buttonsautomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/summary");
		driver.manage().window().fullscreen();
		//To check if the reset button works
		Thread.sleep(1000);
		
		WebElement reset = driver.findElement(By.xpath("//button[contains(text(),'Reset')]"));
		reset.click();
		if(reset.isEnabled()) {
			System.out.println("Element is clickable");
		}else {
			System.out.println("Element is not clickable");
		}
		
	}

}
