package SummaryPageTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class summarypageddown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/summary");
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		WebElement result = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[2]/div[1]/select[1]"));
		Select sel = new Select(result);
		//Getting the size of the drop down
	
		sel.selectByIndex(2);
		
		Thread.sleep(1000);
		WebElement cont = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[2]/div/select[2]"));
		Select sel2 = new Select(cont);
		sel2.selectByIndex(2);
		Thread.sleep(1000);
		sel2.selectByIndex(3);
		Thread.sleep(1000);
		sel2.selectByIndex(4);
		Thread.sleep(1000);
		sel2.selectByIndex(5);
		
		
	}

}
