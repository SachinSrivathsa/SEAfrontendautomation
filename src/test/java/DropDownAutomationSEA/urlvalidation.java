package DropDownAutomationSEA;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

public class urlvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		//URL verification
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://localhost:3000/cases");
		System.out.println("URL Matching");
		
		
	}

}
