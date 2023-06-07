package SummaryPageTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;


import io.github.bonigarcia.wdm.WebDriverManager;

public class languagechangenavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/summary");
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		//Step 1: Change the language in the web page
		WebElement lang = driver.findElement(By.xpath("//select[@name='language']"));
		Select select = new Select(lang);
		select.selectByIndex(1);
		//Changing the language to danish
		Thread.sleep(1000);
		select.selectByIndex(0);
		Thread.sleep(1000);
		//Navigating to the home page
		WebElement home = driver.findElement(By.xpath("//a[@class='sc-hLBbgP dQVlpX'][1]"));
		home.click();
		Thread.sleep(1000);
		//Scrolling down to the bottom of the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		//Navigating to the cases webpage
		WebElement cases = driver.findElement(By.xpath("//a[@class='sc-hLBbgP dQVlpX'][2]"));
		cases.click();
	}

}
