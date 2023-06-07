package SummaryPageTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;


import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplecheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/summary");
		driver.manage().window().fullscreen();
		//To check if multiple check box can be clicked at the same time
		Thread.sleep(1000);
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int Size = checkboxes.size();
		System.out.println(Size);
		for(int i=0;i<Size;i++) {
			checkboxes.get(i).click();
		}
		//After selecting all the drop down, click the button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Going back to the previous page and coming back
		driver.navigate().to("http://localhost:3000/cases");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		//Going back to the old webpage
		driver.navigate().back();
		
		
	}

}
