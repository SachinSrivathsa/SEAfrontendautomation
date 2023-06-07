package SummaryPageTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class buttonsautomation2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/summary");
		driver.manage().window().fullscreen();
		
		Thread.sleep(1000);
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int Size = checkboxes.size();
		System.out.println(Size);
		for(int i=0;i<Size;i++) {
			checkboxes.get(i).click();
		}
		//Clicking the rest button
		WebElement reset = driver.findElement(By.xpath("//button[contains(text(),'Reset')]"));
		reset.click();
		//Checking if the check box is disabled
		WebElement verify = driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(verify.isSelected()) {
			System.out.println("Element is selected");
		}else {
			System.out.println("Element is not selected");
		}
	}

}
