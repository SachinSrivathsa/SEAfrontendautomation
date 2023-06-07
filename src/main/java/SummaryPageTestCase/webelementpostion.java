package SummaryPageTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;
import io.github.bonigarcia.wdm.WebDriverManager;

public class webelementpostion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/summary");
		driver.manage().window().maximize();
		//Checking the position of the check box
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(96, 65));
		WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		Point location = check.getLocation();
		//Printing the location
		System.out.println("The co-ordinates are: " + location);
		
		
		
		

	}

}
