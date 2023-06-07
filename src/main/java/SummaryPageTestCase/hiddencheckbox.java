package SummaryPageTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hiddencheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/summary");
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		WebElement ddown = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[2]/select[1]"));
		Select s = new Select(ddown);
		// Step 1 - Selecting the check box
		s.selectByIndex(1);
		Thread.sleep(1000);
		WebElement check = driver.findElement(By.xpath("//input[@value='Indien']"));
		check.click();
		Thread.sleep(1000);
		WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
		button.click();
		// Changing the drop down option
		s.selectByValue("america");
		Thread.sleep(1000);
		// To check if the previously clicked check box can be clicked
		check.click();
		// Verifying if the element is visible
		if (check.isDisplayed()) {
			System.out.println("Element is visible");
		} else {
			System.out.println("Element is not visible");
		}

	}

}
