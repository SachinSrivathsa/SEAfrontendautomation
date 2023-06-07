package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownlooping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		// Automating drop downs
		WebElement status = driver.findElement(By.xpath("//select[@name='status']"));
		Select ddown = new Select(status);
		// Checking if the first drop down can be clicked.
		status.click();
		Thread.sleep(1000);
		// Checking if the second drop down can be clicked.
		WebElement motive = driver.findElement(By.xpath("//select[@name='motive']"));
		Select ddown2 = new Select(motive);
		motive.click();
		Thread.sleep(1000);
		// Checking if the third drop down can be clicked.
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select ddown3 = new Select(country);
		country.click();
		Thread.sleep(1000);
		// Checking if the fourth drop down can be clicked.
		WebElement gender = driver.findElement(By.xpath("//select[@name='gender']"));
		Select ddown4 = new Select(gender);
		gender.click();

	}

}
