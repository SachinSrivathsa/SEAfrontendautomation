package DropDownAutomationSEA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class dropdownscroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		// Writing a script to check if the drop down can be scrolled or not
		WebElement motive = driver.findElement(By.xpath("//select[@name='motive']"));
		// Clicking the dropdown
		motive.click();
		Thread.sleep(1000);
		// Scrolling to a targeted element
		WebElement targetElement = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/form/div/div[2]/select/option[6]"));
		Actions actions = new Actions(driver);
		actions.scrollToElement(targetElement).perform();
	}

}
