package DropDownAutomationSEA;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowntc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		// Changing the screen resolution
		driver.manage().window().setSize(new Dimension(96, 65));
		WebElement status = driver.findElement(By.xpath("//select[@name='status']"));
		Select ddown = new Select(status);
		ddown.selectByIndex(1);
		
		WebElement motive = driver.findElement(By.xpath("//select[@name='motive']"));
		Select ddown2 = new Select(motive);
		ddown2.selectByIndex(2);
		
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select ddown3 = new Select(country);
		ddown3.selectByVisibleText("All");
	
		WebElement gender = driver.findElement(By.xpath("//select[@name='gender']"));
		Select ddown4 = new Select(gender);
		ddown4.selectByIndex(1);
	
		

	}

}
