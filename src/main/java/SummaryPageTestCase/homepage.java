package SummaryPageTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

public class homepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		// Clicking the graph to see if it goes to the summary page
		WebElement graph = driver.findElement(By.xpath("//*[@id=\"11\"]"));
		graph.click();
		Thread.sleep(1000);
		// Getting the current URL
		System.out.println(driver.getCurrentUrl());
	}

}
