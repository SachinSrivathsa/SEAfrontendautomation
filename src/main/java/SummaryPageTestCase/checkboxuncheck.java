package SummaryPageTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxuncheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/summary");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// Randomly select three checkboxes
		WebElement check1 = driver.findElement(By.xpath("//input[@value='Honduras']"));
		check1.click();
		Thread.sleep(1000);
		WebElement check2 = driver.findElement(By.xpath("//input[@value='Georgien']"));
		check2.click();
		Thread.sleep(1000);
		WebElement check3 = driver.findElement(By.xpath("//input[@value='Eritrea']"));
		check3.click();
		// Pressing the confirm case button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);

		// Unchecking all the check boxes
		check1.click();
		Thread.sleep(1000);
		check2.click();
		Thread.sleep(1000);
		check3.click();
	}

}
