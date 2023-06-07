package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowntest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		//Automating the first drop down
		WebElement status = driver.findElement(By.xpath("//select[@name='status']"));
		Select ddown = new Select(status);
		List<WebElement> options = ddown.getOptions();
		//Printing the number of elements in the list
		System.out.println(options.size());
		//Printing the elements in the first drop down list
		/*int i;
		for(i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}*/
		//Select the values in the first drop down. 
		ddown.selectByVisibleText("All");
		//Selecting the values in the second drop down
		WebElement motive = driver.findElement(By.xpath("//select[@name='motive']"));
		Select ddown2 = new Select(motive);
		ddown2.selectByIndex(0);
		//Selecting the values in the third dropdown
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		Select ddown3 = new Select(country);
		ddown3.selectByVisibleText("All");
		//Selecting the values in the final dropdown
		WebElement gender = driver.findElement(By.xpath("//select[@name='gender']"));
		Select ddown4 = new Select(gender);
		ddown4.selectByIndex(0);
		//Pressing the button to check the result
		WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
		button.click();
		Thread.sleep(5000);
		//Clicking the new case button multiple times to see the result
		
		int i;
		for(i=0; i<10000; i++) {
			WebElement newcaseButton = driver.findElement(By.xpath("//text[contains(text(),'New Case')]"));
			newcaseButton.click();
			//Setting the waiting time
			Thread.sleep(2000);
			button.click();
			
		}
		
		
		
		
		
		

	}

}
