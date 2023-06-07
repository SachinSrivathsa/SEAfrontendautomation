package SummaryPageTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class casesbutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		Thread.sleep(1000);
		//What happens if the user clicks the 'View Cases' button multiple times
		WebElement cases = driver.findElement(By.xpath("//input[@type='submit']"));
		for(int i=0;i<10;i++) {
			//Clicking the button 10 times
			cases.click();
		}
		
		

	}

}
