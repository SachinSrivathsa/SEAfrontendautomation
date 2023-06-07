package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class caselimit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/cases");
		WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
		button.click();
		Thread.sleep(5000);
		int i;
		for(i=0;i<10000;i++) {
			WebElement newcaseButton = driver.findElement(By.xpath("//text[contains(text(),'New Case')]"));
			newcaseButton.click();
			//Printing the status
			WebElement status = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/text[2]"));
			System.out.println(status.getText());
			//Printing the motive
			WebElement motive = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/text[2]"));
			System.out.println(motive.getText());
			//Printing the country of origin
			WebElement origin = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/text[2]"));
			System.out.println(origin.getText());
			//Printing the gender
			WebElement gender = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[4]/text[2]"));
			System.out.println(gender.getText());
		
		}
	
	
	}

}
