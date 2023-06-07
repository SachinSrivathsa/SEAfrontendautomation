package DropDownAutomationSEA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowntc5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		country.click();
		Thread.sleep(1000);
		//Clicking on random element to check if the drop down closes
		driver.findElement(By.xpath("//div[@class='sc-bcXHqe cKUiDO']")).click();
		

	}

}
