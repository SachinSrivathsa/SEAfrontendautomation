package SummaryPageTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class languagechange {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/summary");
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		//Changing the language to English
		WebElement lang = driver.findElement(By.xpath("//select[@name='language']"));
		Select select = new Select(lang);
		select.selectByIndex(1);
		Thread.sleep(1000);
		//Changing the language to Danish
		select.selectByValue("da");
		Thread.sleep(1000);
		//Changing the language back to English
		select.selectByIndex(1);

	}

}
