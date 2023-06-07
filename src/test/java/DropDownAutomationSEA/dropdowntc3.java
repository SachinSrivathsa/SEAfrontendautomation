package DropDownAutomationSEA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowntc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		WebElement status = driver.findElement(By.xpath("//select[@name='status']"));
		System.out.println(status.getAttribute("maxlength"));
		
		//Checking the maximum length for the second drop down
		WebElement motive = driver.findElement(By.xpath("//select[@name='motive']"));
		System.out.println(motive.getAttribute("maximumlength"));
		
		//Checking the maximum length for the third drop down
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		System.out.println(country.getAttribute("maximumlength"));
		
		//Checking the maximum length for the fourth drop down
		WebElement gender = driver.findElement(By.xpath("//select[@name='gender']"));
		System.out.println(gender.getAttribute("maximumlength"));

	}

}
