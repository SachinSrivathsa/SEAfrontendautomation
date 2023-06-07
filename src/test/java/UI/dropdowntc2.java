package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowntc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		//To check if the drop down could be opened if we press the down arrow key
		WebElement status = driver.findElement(By.xpath("//select[@name='status']"));
		Select ddown = new Select(status);
		status.sendKeys(Keys.DOWN);
		
	
	}

}
