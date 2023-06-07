package SummaryPageTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class summarypagedropdowntest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/summary");
		driver.manage().window().maximize();
		//Automating the drop down in the web page
		WebElement findCountry = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[2]/select[1]"));
		Select country = new Select(findCountry);
		//Selecting the continent
		country.selectByIndex(1);
		Thread.sleep(1000);
		//Clicking the confirm choice button 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		//Selecting the second drop down value
		country.selectByValue("america");
		Thread.sleep(1000);
		//Selecting the third drop down
		country.selectByIndex(3);
		//Selecting the fourth drop down
		Thread.sleep(1000);
		country.selectByIndex(4);
		//Selecting the fifth drop down
		Thread.sleep(1000);
		country.selectByIndex(5);

	}

}
