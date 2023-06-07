package SummaryPageTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxautomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/summary");
		driver.manage().window().fullscreen();
		//Need to verify check box is clickable 
		Thread.sleep(1000);
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='Bosnien-Hercegovina']"));
		checkbox.click();
		//Verifying if the check box is selected.
		if(checkbox.isSelected()) {
			System.out.println("Checkbox is Selected");
		}else {
			System.out.println("Checkbox is not Selected");
		}
		//Clicking the confirm choices button
		WebElement choice = driver.findElement(By.xpath("//input[@type='submit']"));
		choice.click();
		
		
		
	}

}
